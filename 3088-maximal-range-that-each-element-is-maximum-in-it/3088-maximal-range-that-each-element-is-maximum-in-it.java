class Solution {

    public int[] maximumLengthOfRanges(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> idxStack = new Stack<>();

        for (int currIdx = 0; currIdx < n; currIdx++) {
            while (!idxStack.empty() && nums[idxStack.peek()] < nums[currIdx]) {
                idxStack.pop();
            }
            left[currIdx] = idxStack.empty() ? -1 : idxStack.peek();
            idxStack.push(currIdx);
        }

        idxStack.clear();

        for (int currIdx = n - 1; currIdx >= 0; currIdx--) {
            while (!idxStack.empty() && nums[idxStack.peek()] < nums[currIdx]) {
                idxStack.pop();
            }
            right[currIdx] = idxStack.empty() ? n : idxStack.peek();
            idxStack.push(currIdx);
        }

        int[] ans = new int[n];
        for (int currIdx = 0; currIdx < n; currIdx++) {
            ans[currIdx] = right[currIdx] - left[currIdx] - 1;
        }

        return ans;
    }
}