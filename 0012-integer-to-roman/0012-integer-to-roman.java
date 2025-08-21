class Solution {
    public String intToRoman(int num) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        Collections.reverse(entries);

        StringBuilder res = new StringBuilder();

        for (Map.Entry<String, Integer> entry : entries) {
            int x = num / entry.getValue();
            for (int i = 0; i < x; i++) {
                res.append(entry.getKey());
            }
            num = num % entry.getValue();
        }

        return res.toString();
    }
}