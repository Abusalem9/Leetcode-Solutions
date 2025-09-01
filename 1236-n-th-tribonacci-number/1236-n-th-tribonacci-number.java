class Solution {
    public int tribonacci(int n) {

        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int one = 1;
        int two = 1;
        int three = 2;

        for (int i = 4; i <= n; i++) {
            int temp = one + two + three;
            one = two;
            two= three;
            three = temp;
        }

        return three;
    }
}