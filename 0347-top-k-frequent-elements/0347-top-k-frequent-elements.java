class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));

        for (int n : map.keySet()) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }

        int[] ans = new int[k];

        for (int i = k -1 ; i >= 0 ; i--) {
            ans[i] = heap.poll();
        }

        return ans;
    }
}