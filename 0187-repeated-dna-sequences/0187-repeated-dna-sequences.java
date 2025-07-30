class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<>();
        int j = 10;
        HashSet<String> ans = new HashSet<>();
        for (int i = 0; i < s.length() - 9; i++) {
            String temp = s.substring(i, j);
            j++;
            if (set.contains(temp)) {
                ans.add(temp);
            }
            set.add(temp);
        }

        return new ArrayList<>(ans);
    }
}