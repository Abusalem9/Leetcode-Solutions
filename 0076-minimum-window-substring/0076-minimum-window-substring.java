class Solution {
    public String minWindow(String s, String t) {

        int i = 0;
        int j = 0;

        int n = s.length();

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (char ch : t.toCharArray()) {
            sMap.put(ch, 0);
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        int have = 0;
        int need = tMap.size();
        int count = Integer.MAX_VALUE;
        int start = 0;

        while (j < n) {
            char ch = s.charAt(j);

            if (tMap.containsKey(ch)) {
                sMap.put(ch, sMap.get(ch) + 1);
                if (sMap.get(ch).intValue() == tMap.get(ch).intValue()) {
                    have++;
                }
            }

            while (have == need) {
                if ((j - i + 1) < count) {
                    count = j - i + 1;
                    start = i;
                }

                char st = s.charAt(i);
                if (tMap.containsKey(st)) {
                    sMap.put(st, sMap.get(st) - 1);
                    if (sMap.get(st) < tMap.get(st)) {
                        have--;
                    }
                }
                i++;
            }
            j++;
        }

        return count == Integer.MAX_VALUE ? "" : s.substring(start, start + count);
    }
}
