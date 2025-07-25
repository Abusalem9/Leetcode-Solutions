class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < n - 1 && arr[left] <= arr[left + 1]) {
            left++;
        }

        if (left == n - 1) return 0;

        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--;
        }

        int minToRemove = Math.min(n - left - 1, right);

        int i = 0, j = right;
        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                minToRemove = Math.min(minToRemove, j - i - 1);
                i++;
            } else {
                j++;
            }
        }

        return minToRemove;
    }
}
