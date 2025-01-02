class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {

        int[] ans = new int[queries.length];

        int[] prefixSum = new int[words.length + 1];

        int count = 0;

        for(int i = 0 ; i < words.length ; i++){
            String s = words[i];
            if (isVowel(s.charAt(0)) && isVowel(s.charAt(s.length() - 1))) {
                count++;
            }
            prefixSum[i + 1] = count;
        }

        // System.out.println(Arrays.toString(prefixSum));

        int i = 0;
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            ans[i++] = prefixSum[end + 1] - prefixSum[start];
        }

        return ans;
    }

    public boolean isVowel(char c) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
                || c == 'U') {
            return true;
        } else {
            return false;
        }
    }
}