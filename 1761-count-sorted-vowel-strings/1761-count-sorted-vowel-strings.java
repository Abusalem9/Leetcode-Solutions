class Solution {
    int count = 0;

    public int countVowelStrings(int n) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        backTrack(n, vowels, new StringBuilder(), 0);
        return count;
    }

    public void backTrack(int n, char[] vowels, StringBuilder temp, int i) {
        if (i == vowels.length) {
            return;
        }

        if (temp.length() == n) {
            count++;
            return;
        }

        temp.append(vowels[i]);
        backTrack(n, vowels, temp, i++);
        temp.deleteCharAt(temp.length() - 1);
        backTrack(n, vowels, temp, i);
    }
}