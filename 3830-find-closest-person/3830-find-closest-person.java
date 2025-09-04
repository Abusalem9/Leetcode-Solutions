class Solution {
    public int findClosest(int x, int y, int z) {
        
        int zx = Math.abs(z-x);
        int zy = Math.abs(z-y);
        if( zx < zy){
            return 1;
        }
        else if(zx > zy){
            return 2;
        }
        else 
            return 0;
    }
}