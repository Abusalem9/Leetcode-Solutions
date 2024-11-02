class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> s = new Stack();
        for (int i = 2 * n; i >= 0; i--) {
            int num = nums[i % n];
            while (!s.isEmpty() && s.peek() <= num) {
                s.pop();
            }
            if (i < n) {
                nums[i] = s.isEmpty() ? -1 : s.peek();
            }
            s.push(num);
        }
        return nums;
    }
}