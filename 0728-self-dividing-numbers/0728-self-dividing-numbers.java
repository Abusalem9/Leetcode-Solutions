class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> ans = new ArrayList<>();
        for(int i = left ; i <= right ; i++){
            int num = i;
            boolean f = false;
            while(num > 0){
                int rem = num % 10;
                if(rem == 0 || i % rem != 0){
                    f = true;
                    break;
                }
                num = (num - rem) / 10;
            }

            if(!f){
                ans.add(i);
            }
        } 

        return ans;  
    }
}