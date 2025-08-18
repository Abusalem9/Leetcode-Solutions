class Solution {
    public boolean judgePoint24(int[] cards) {

        List<Double> nums = new ArrayList<>();

        for (int card : cards) {
            nums.add((double) card);
        }

        return backTrack(nums);

    }

    public boolean backTrack(List<Double> cards){
        if(cards.size() == 1){
            return Math.abs(cards.get(0) - 24) < 1e-6;
        }

        for(int i = 0 ; i < cards.size() ; i++ ){
            for(int j = 0 ; j < cards.size() ; j++){
                if(i == j) continue;
                List<Double> list = new ArrayList<>();
                for(int k = 0 ; k < cards.size() ; k++){
                    if(k != i && k != j) list.add(cards.get(k));
                }  

                for (double val : compute(cards.get(i), cards.get(j))) {
                    list.add(val);
                    if (backTrack(list)) return true;
                    list.remove(list.size() - 1);
                }             
            }
        }
        return false;
    }

     private List<Double> compute(double a, double b) {
        List<Double> res = new ArrayList<>();
        res.add(a + b);
        res.add(a - b);
        res.add(b - a);
        res.add(a * b);
        if (Math.abs(b) > 1e-6) res.add(a / b);
        if (Math.abs(a) > 1e-6) res.add(b / a);
        return res;
    }
}