class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int last = -1;
        for (int i : arr) {
            if (map.get(i) == i) {
                last = Math.max(last, i);
            }
        }

        return last;
    }
}