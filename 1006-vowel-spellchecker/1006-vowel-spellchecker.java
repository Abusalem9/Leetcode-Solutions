class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> set = new HashSet<>();
        Map<String, String> caseIn = new HashMap<>();
        Map<String, String> vowelIn = new HashMap<>();

        for (String word : wordlist) {
            set.add(word);

            String lower = word.toLowerCase();
            caseIn.putIfAbsent(lower, word);

            String deVowel = deVowel(lower);
            vowelIn.putIfAbsent(deVowel, word);
        }

        String[] ans = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];

            if (set.contains(q)) {
                ans[i] = q;
                continue;
            }

            String lower = q.toLowerCase();
            if (caseIn.containsKey(lower)) {
                ans[i] = caseIn.get(lower);
                continue;
            }

            String devoweled = deVowel(lower);
            if (vowelIn.containsKey(devoweled)) {
                ans[i] = vowelIn.get(devoweled);
                continue;
            }

            ans[i] = "";
        }
        return ans;
    }

    public String deVowel(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                sb.append("*");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) >= 0;
    }
}