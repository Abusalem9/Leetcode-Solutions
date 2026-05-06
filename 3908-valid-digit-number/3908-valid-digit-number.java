class Solution {
    public boolean validDigit(int n, int x) {

        int temp = n;
        int count = 0;

        while (temp > 9) {
            int lastDigit = Math.abs(temp) % 10;
            if (lastDigit == x) {
                count++;
            }
            temp = temp / 10;
        }
        if (temp == x)
            return false;
        return count > 0;
    }
}