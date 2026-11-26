class Solution {
    public boolean canAliceWin(int n) {
        int a = 10;
        int b = 9;
        while (n > 0) {
            if (a > b) {
                n -= a;
                a -= 2;
                if (n < 0) {
                    return false;
                }
            } else {
                n -= b;
                b -= 2;
                if (n < 0) {
                    return true;
                }
            }
        }
        if (a > b) {
            return false;
        } else {
            return true;
        }
    }
}