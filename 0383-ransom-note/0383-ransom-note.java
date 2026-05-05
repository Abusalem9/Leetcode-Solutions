class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomNote.toCharArray()) {
            if (map.containsKey(ch)) {
                int temp = map.get(ch);
                if (temp < 1)
                    return false;
                map.put(ch, temp - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}