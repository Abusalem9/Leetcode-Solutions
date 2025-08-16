class Solution {
    public int maximum69Number(int num) {

        String s = Integer.toString(num);
        int n = s.length();
        char[] ch = s.toCharArray();

        for (int i = 0; i < n; i++) {
            if (ch[i] == '6') {
                ch[i] = '9';
                break;
            }
        }
        StringBuilder res = new StringBuilder();
        for (char c : ch) {
            res.append(c);
        }

        return Integer.parseInt(res.toString());
    }
}