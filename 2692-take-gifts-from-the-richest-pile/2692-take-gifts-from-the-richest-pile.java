class Solution {
    public long pickGifts(int[] gifts, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));

        for (int gift : gifts) {
            pq.add(gift);
        }

        while (k-- > 0) {
            pq.add((int) Math.sqrt(pq.remove()));
        }

        long sum = 0;
        while (pq.size() > 0) {
            sum += pq.remove();
        }

        return sum;
    }
}