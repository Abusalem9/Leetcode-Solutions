class Solution {
    public String compressedString(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        }

        int count = 1;
        char last = word.charAt(0);
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == last) {
                count++;
                if (count == 9) {
                    result.append('9').append(last);
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
