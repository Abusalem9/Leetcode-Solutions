class Solution {
    public int differenceOfSum(int[] nums) {

        int digitSum = 0;
        int elementSum = 0;

        for (int i : nums) {
            elementSum += i;
            while (i > 0) {
                int d = i % 10;
                digitSum += d;
                i = i / 10;
            }
        }

        // System.out.println(digitSum);

        return elementSum - digitSum;
    }
}