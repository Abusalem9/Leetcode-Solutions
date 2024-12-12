class Solution {
    public long maxKelements(int[] nums, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            queue.add(num);
        }

        long sum = 0;
        while (k-- > 0) {
            int largest = queue.poll();
            // System.out.println(largest);
            sum += largest;
            queue.add((int) Math.ceil((double) largest / 3));
        }

        return sum;
    }
}