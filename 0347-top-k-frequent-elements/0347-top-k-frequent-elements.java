class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i =0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault
            (nums[i], 0) + 1);
        }

        List<Integer>[]  arr = new List[nums.length + 1];

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(arr[entry.getValue()] == null){
                arr[entry.getValue()] = new ArrayList<>();
            }
            arr[entry.getValue()].add(entry.getKey());
        }
        int[] ans = new int[k];
        int m= 0;
        for(int i = nums.length ; i >= 0 ; i--){
            if(arr[i]!= null){
                for(int j = 0 ; j < arr[i].size(); j++){
                    if(m >= k){
                        break;
                    }
                    ans[m++] = arr[i].get(j);
                }
            }
        }
        return ans;
    }
}