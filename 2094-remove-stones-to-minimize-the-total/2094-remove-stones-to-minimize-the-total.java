class Solution {
    public int minStoneSum(int[] piles, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));

        for (int pile : piles) {
            pq.add(pile);
        }

        while (k-- > 0) {
            int largest = pq.poll();
            pq.add(largest - largest / 2);
        }

        int sum = 0;
        
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        return sum;
    }
}