class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>(Set.of(
                'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int l = 0;
        int r = s.length() - 1;

        char[] ch = s.toCharArray();

        while (l < r) {
            if (set.contains(ch[l]) && set.contains(ch[r])) {
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            } else if (!set.contains(ch[l])) {
                l++;
            } else if (!set.contains(ch[r])) {
                r--;
            }
        }

        StringBuilder res = new StringBuilder();

        for (char c : ch) {
            res.append(c);
        }

        return res.toString();
    }
}