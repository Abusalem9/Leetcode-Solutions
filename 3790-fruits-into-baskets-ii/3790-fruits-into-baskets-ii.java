class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < baskets.length; j++) {
                if (!map.containsKey(j) && fruits[i] <= baskets[j]) {
                    map.put(j, fruits[i]);
                    break;
                }
            }
        }

        return fruits.length - map.size();
    }
}