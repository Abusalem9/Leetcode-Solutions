class Solution {
    public String addSpaces(String s, int[] spaces) {

        StringBuilder res = new StringBuilder();
        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            if (t < spaces.length && i == spaces[t]) {
                res.append(' ');
                t++;
            }
            res.append(s.charAt(i));
        }

        return res.toString();
    }
}