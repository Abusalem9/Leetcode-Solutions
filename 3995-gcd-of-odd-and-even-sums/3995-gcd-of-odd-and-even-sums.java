class Solution {
    public int gcdOfOddEvenSums(int n) {

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        return findGCD(evenSum, oddSum);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}