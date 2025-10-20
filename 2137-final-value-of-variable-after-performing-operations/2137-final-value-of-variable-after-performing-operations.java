class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int k = 0;

        for (String s : operations) {
            if (s.equals("--X") || s.equals("X--")) {
                k--;
            } else {
                k++;
            }
        }
        return k;
    }
}