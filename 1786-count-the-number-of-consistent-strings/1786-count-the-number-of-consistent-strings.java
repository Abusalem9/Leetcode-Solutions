class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : allowed.toCharArray()) {
            set.add(ch);
        }

        int ans = 0;

        for (int i = 0; i < words.length; i++) {
            boolean f = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))) {
                    f = false;
                    break;
                }
            }
            if (f)
                ans++;
        }

        return ans;
    }
}