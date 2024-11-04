class Solution {
    public String compressedString(String word) {

        int count = 0;

        char last = word.charAt(0);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (i > 0 && last == ch) {
                count++;
                if (count == 9) {
                    result.append('9').append(ch);
                    count = 0;
                }
            } else {
                if (count > 0) {
                    result.append(count).append(last);
                }
                last = ch;
                count = 1;
            }
        }

        if (count > 0) {
            result.append(count).append(last);
        }

        return result.toString();
    }
}