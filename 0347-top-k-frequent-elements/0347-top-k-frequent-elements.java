class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i =0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault
            (nums[i], 0) + 1);
        }

        Map<Integer, Integer> sorted = map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (oldValue , newValue) -> oldValue,
                            LinkedHashMap::new
                        ));
        int[] ans = new int[k];
        int i = 0;
        for(Map.Entry<Integer,Integer> entry : sorted.entrySet()){
            if(k <= 0){
                break;
            }
            ans[i++] = entry.getKey();
            k--;
        }

        return ans;
    }
}