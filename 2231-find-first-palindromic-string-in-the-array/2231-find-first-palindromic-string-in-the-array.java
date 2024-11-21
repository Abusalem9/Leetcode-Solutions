class Solution {
    public String firstPalindrome(String[] words) {

        for (String s : words) {
            int left = 0, right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                } else {
                    break;
                }
            }
            if (left >= right) {
                return s;
            }
        }

        return "";
    }
}