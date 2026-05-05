class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] ca = new int[26];

        for (char ch : magazine.toCharArray()) {
            ca[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            if (ca[ch - 'a'] < 1)
                return false;
            ca[ch - 'a']--;
        }
        return true;
    }
}