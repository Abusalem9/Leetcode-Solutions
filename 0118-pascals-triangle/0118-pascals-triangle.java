class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        ans.add(temp);
        for(int i = 0; i < numRows - 1; i++){
            List<Integer> iterate = ans.get(i);
            List<Integer> addition = new ArrayList<>();
            addition.add(1);
            for(int j = 0 ; j < iterate.size() - 1; j++){
                addition.add(iterate.get(j) + iterate.get(j + 1) );
            }
            addition.add(1);
            ans.add(addition);
        }

        return ans;
    }
}