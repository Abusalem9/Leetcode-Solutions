class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;
        while(n>1){
            if(n%4==1 || n%4==3 ||n%4==2)
                return false;
            n=n/4;
        }
        return true;
    }
}