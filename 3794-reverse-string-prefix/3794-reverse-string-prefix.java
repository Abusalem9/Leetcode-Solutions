class Solution {
    public String reversePrefix(String s, int k) {

        char[] ch = s.toCharArray();

        int l = 0;
        int r = k - 1;

        while (l < r) {
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        StringBuilder ans = new StringBuilder();
        for (char c : ch) {
            ans.append(c);
        }

        return ans.toString();
    }
}