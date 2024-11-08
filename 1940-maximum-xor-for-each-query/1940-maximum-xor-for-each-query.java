class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {

        
        int xor = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
        }

        int[] ans = new int[nums.length];
        int mask = (1 << maximumBit) - 1;
        
        for(int i = n-1 ; i >= 0 ; i--){
            ans[i] = mask ^ xor;
            xor ^= nums[i];
        }
        int left = 0;
        int right = n - 1; 
        while(left < right){
            int temp = ans[left];
            ans[left] = ans[right];
            ans[right] = temp;
            left++;
            right--;
        }

        return ans;
    }
}