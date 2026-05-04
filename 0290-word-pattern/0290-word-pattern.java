class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] sa = s.split(" ");

        if (pattern.length() != sa.length)
            return false;

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i)) && (!map.get(pattern.charAt(i)).equals(sa[i]))
                    || map2.containsKey(sa[i]) && (!map2.get(sa[i]).equals(pattern.charAt(i)))) {
                return false;
            }
            map.put(pattern.charAt(i), sa[i]);
            map2.put(sa[i], pattern.charAt(i));
        }
        return true;
    }
}