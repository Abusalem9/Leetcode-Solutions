class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alphabet = new int[26];

        for (char ch : sentence.toCharArray()) {
            alphabet[ch - 'a']++;
        }

        for (int i : alphabet) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }
}