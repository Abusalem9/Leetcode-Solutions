class Solution {
    public String removeVowels(String s) {
        StringBuilder res = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for (char ch : s.toCharArray()) {
            if (!set.contains(ch)) {
                res.append(ch);
            }
        }

        return res.toString();
    }
}