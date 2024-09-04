class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : answers){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int res = 0;
        for(int key : map.keySet()){
            int size = map.get(key);
            int groupSize = key + 1;
            int k = (int) Math.ceil(size * 1.0 / groupSize * 1.0);
            res += k * groupSize;
        }

        return res;
    }
}