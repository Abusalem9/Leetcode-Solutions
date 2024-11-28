class Solution {
    public int maxOperations(int[] nums, int k) {
        
        int left = 0;
        int right = nums.length - 1;

        Arrays.sort(nums);

        int count = 0;

        while(left < right){
            if(nums[left] + nums[right] == k){
                count++;
                left++;
                right--;
            }
            else if(nums[left] + nums[right] > k){
                right--;
            }
            else{
                left++;
            }
        }

        return count;
    }
}