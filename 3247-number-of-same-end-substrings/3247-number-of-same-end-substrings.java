class Solution {
  public int[] sameEndSubstringCount(String s, int[][] queries) {
    int[] ans = new int[queries.length];
    int[] count = new int[26];

    int[][] counts = new int[s.length() + 1][26];

    for (int i = 0; i < s.length(); i++) {
      ++count[s.charAt(i) - 'a'];
      System.arraycopy(count, 0, counts[i + 1], 0, 26);
    }

    for (int i = 0; i < queries.length; ++i) {
      final int l = queries[i][0];
      final int r = queries[i][1];
      int sameEndCount = 0;
      for (char c = 'a'; c <= 'z'; ++c) {
        final int freq = counts[r + 1][c - 'a'] - counts[l][c - 'a'];
        sameEndCount += freq * (freq + 1) / 2;
      }
      ans[i] = sameEndCount;
    }

    return ans;
  }
}