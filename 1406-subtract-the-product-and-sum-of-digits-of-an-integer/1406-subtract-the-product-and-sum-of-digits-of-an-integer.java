class Solution {
    public int subtractProductAndSum(int n) {

        int mul = 1;
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int x = temp % 10;
            mul *= x;
            temp = temp / 10;
        }

        while (n > 0) {
            int x = n % 10;
            sum += x;
            n = n / 10;
        }

        return mul - sum;

    }
}