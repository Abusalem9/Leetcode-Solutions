class Solution {
    public char findTheDifference(String s, String t) {
        int[] ca = new int[26];

        for (char ch : t.toCharArray()) {
            ca[ch - 'a']++;
        }

        for (char ch : s.toCharArray()) {
            ca[ch - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (ca[i] == 1) {
                return (char) (i + 'a');
            }
        }

        return 'a';
    }
}