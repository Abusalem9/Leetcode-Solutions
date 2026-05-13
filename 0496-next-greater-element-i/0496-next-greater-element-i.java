class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        for (int i = 0; i < nums1.length; i++) {
            boolean f = false;
            int val = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    f = true;
                }

                if (f && nums1[i] < nums2[j]) {
                    val = nums2[j];
                    break;
                }
            }
            nums1[i] = val;
        }
        return nums1;
    }
}