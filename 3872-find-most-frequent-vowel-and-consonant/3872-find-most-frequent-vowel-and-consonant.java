class Solution {
    public int maxFreqSum(String s) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a'] = freq[ch - 'a'] + 1;
        }

        int vowelMax = 0;
        for (char j : vowels) {
            vowelMax = Math.max(vowelMax, freq[j - 'a']);
            freq[j - 'a'] = 0;
        }
        int consonantMax = 0;

        for (int i = 0 ; i < 26 ; i++) {
            consonantMax = Math.max(consonantMax, freq[i]);
        }

        return vowelMax + consonantMax;

    }
}