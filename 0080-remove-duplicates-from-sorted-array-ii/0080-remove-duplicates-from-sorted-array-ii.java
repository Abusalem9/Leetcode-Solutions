class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int last = nums[0];
        int count = 1;
        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == last) {
                if (count < 2) {
                    nums[index++] = nums[i];
                }
                count++;
            } else {
                count = 1;
                last = nums[i];
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
