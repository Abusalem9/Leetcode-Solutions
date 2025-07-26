class Solution {
    public int countGoodSubstrings(String s) {
        int ans = 0;
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.size() == 3) {
                ans++;
                set.remove(s.charAt(j++));
            }
            while (set.contains(ch)) {
                set.remove(s.charAt(j++));
            }
            set.add(ch);
        }
        if (set.size() == 3) {
            ans++;
            set.remove(s.charAt(j++));
        }
        return ans;
    }
}