class Solution {
    public int countPrefixSuffixPairs(String[] words) {

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (i == j) {
                    continue;
                }
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isPrefixAndSuffix(String i, String j) {
        if (i.length() > j.length()) {
            return false;
        }

        for (int k = 0; k < i.length(); k++) {
            if (i.charAt(k) != j.charAt(k) || i.charAt(i.length() - k - 1) != j.charAt(j.length() - k - 1)) {
                return false;
            }
        }
        return true;
    }

}