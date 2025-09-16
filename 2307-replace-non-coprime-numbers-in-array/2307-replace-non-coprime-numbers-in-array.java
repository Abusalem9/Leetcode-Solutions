class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stack = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (!stack.isEmpty()) {
                int top = stack.get(stack.size() - 1);
                int val = gcd(top, num);
                if (val == 1) {
                    break;
                }
                stack.remove(stack.size() - 1);
                num = (top / val) * num;
            }
            stack.add(num);
        }
        return stack;
    }

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}