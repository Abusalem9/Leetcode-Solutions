class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0, curr = 0, max = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(max < nums[i]){
                max = nums[i];
                curr = ans = 0;
            }

            if(max == nums[i]){
                curr++;
            }else{
                curr = 0;
            }

            ans = Math.max(ans , curr);
        }

        return ans;
    }
}