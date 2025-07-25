class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {

        int xor = 0;
        if (nums2.length % 2 == 1) {
            for (int i = 0; i < nums1.length; i++) {
                xor ^= nums1[i];
            }
        }

        if (nums1.length % 2 == 1) {
            for (int i = 0; i < nums2.length; i++) {
                xor ^= nums2[i];
            }
        }

        return xor;
    }
}