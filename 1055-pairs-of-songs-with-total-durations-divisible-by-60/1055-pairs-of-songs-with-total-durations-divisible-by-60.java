class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < time.length; i++) {
            int remainder = time[i] % 60;
            int complement = (60 - remainder) % 60;

            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
}
