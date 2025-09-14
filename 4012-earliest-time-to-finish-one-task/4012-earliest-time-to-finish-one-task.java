class Solution {
    public int earliestTime(int[][] tasks) {
        int ans = Integer.MAX_VALUE;
        for(int[] task : tasks){
            int start = task[0];
            int end = task[1];
            ans = Math.min(ans, (start + end));
        }
        return ans;
    }
}