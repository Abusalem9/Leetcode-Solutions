class Solution {
    public int hammingWeight(int n) {
        
        int ans = 1;

        while(n > 1){
            ans += n & 1;
            n = n >> 1;
        }

        return ans;
    }
}