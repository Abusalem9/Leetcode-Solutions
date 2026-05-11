class Solution {
    public int maxDistinct(String s) {

        int count = 0;
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                continue;
            } else {
                count++;
                set.add(s.charAt(i));
            }
        }
        return count;
    }
}