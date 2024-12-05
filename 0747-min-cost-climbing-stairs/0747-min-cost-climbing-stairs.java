class Solution {
    public int minCostClimbingStairs(int[] cost) {
    int last = 0;       // The cost to reach the last step
    int lastPrev = 0;   // The cost to reach the second last step

    // Start from the second last stair and move backward
    for (int i = cost.length - 1; i >= 0; i--) {
        int current = cost[i] + Math.min(last, lastPrev);
        lastPrev = last;
        last = current;
    }

    // The result is the minimum cost between starting from the first or second step
    return Math.min(last, lastPrev);
}

}