class Solution {
    public int numRabbits(int[] answers) {
        int rabbit = 0;
        int[] count = new int[1001];
        for(int answer : answers){
            if(count[answer] % (answer + 1) == 0)
                rabbit += answer + 1;
            count[answer]++;
        }
        return rabbit;
    }
}