class Solution {
    public String makeFancyString(String s) {
        int count = 1;
        StringBuilder res = new StringBuilder();
        char last = s.charAt(0);
        res.append(last);

        for (int i = 1; i < s.length(); i++) {
            if (last == s.charAt(i)) {
                if (count < 2) {
                    res.append(s.charAt(i));
                    count++;
                }
            } else {
                res.append(s.charAt(i));
                count = 1;
                last = s.charAt(i);
            }
        }
        return res.toString();
    }
}
