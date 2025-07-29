class Solution {
    public int lengthOfLongestSubstring(String s) {

        int i = 0;
        int j = 0;

        int n = s.length();

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        int ans = 0;
        while (i < n && j < n) {
            char ch = s.charAt(j);
            while (set.contains(ch)) {
                set.remove(s.charAt(i++));
            }
            set.add(ch);
            ans = Math.max(ans, set.size());
            j++;
        }

        return ans;
    }
}