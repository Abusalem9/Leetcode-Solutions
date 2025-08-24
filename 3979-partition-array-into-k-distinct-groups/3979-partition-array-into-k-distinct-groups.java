class Solution {
    public boolean partitionArray(int[] nums, int k) {
        if (nums.length % k != 0)
            return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        int c = nums.length / k;

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int val : map.values()) {
            if (val > c)
                return false;
        }

        return true;
    }
}