class Solution {
    public long[] findPrefixScore(int[] nums) {
        
        long[] arr = new long[nums.length];
        arr[0] = nums[0] * 2;
        int max = nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            max = Math.max(nums[i],max);
            if(i > 0){
                arr[i] = max + nums[i] + arr[i - 1];
            }
        }

        return arr;
    }
}