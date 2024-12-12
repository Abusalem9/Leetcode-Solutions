class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>((a, b) -> Double.compare(b, a));

        double sum = 0;
        for (int num : nums) {
            sum += num;
            pq.add((double) num);
        }

        double halfSum = sum / 2;
        double currentSum = sum;
        int count = 0;

        while (currentSum > halfSum) {
            double largest = pq.poll();
            double reduced = largest / 2;
            pq.add(reduced);
            currentSum -= reduced;
            count++;
        }

        return count;
    }
}
