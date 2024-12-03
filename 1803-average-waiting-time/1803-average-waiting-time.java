class Solution {
    public double averageWaitingTime(int[][] customers) {

        int startTime = 0;
        long sum = 0;
        for (int[] cust : customers) {
            int start = cust[0];
            int time = cust[1];
            if (start > startTime) {
                startTime = start + time;
                sum += startTime - start;
            } else {
                startTime += time;
                sum += startTime - start;
            }
        }

        return sum / (double) customers.length;
    }
}