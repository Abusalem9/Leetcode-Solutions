class Solution {
    public String sortVowels(String s) {
        boolean[] arr = new boolean[s.length()];

        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                arr[i] = true;
                temp.append(ch);
            }
        }

        char[] charA = temp.toString().toCharArray();

        Arrays.sort(charA);
        int k = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (arr[i]) {
                res.append(charA[k++]);
            } else {
                res.append(s.charAt(i));
            }
        }

        return res.toString();
    }
}