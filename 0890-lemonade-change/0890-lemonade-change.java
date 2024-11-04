class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveRupees = 0;
        int tenRupees = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fiveRupees++;
            } else if (bill == 10) {
                if (fiveRupees == 0) {
                    return false;
                }
                fiveRupees--;
                tenRupees++;
            } else {
                if (tenRupees > 0 && fiveRupees > 0) {
                    tenRupees--;
                    fiveRupees--;
                } else if (fiveRupees >= 3) {
                    fiveRupees -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
