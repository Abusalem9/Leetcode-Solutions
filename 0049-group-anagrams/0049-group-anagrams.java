class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<Integer, List<String>> map = new HashMap<>();

        for(int i = 0 ; i < strs.length ; i++){
            int[] arr = new int[26];

            for(int j = 0; j < strs[i].length(); j++){
                char ch = strs[i].charAt(j);
                arr[ch - 'a']++;
            }
            int hash = Arrays.hashCode(arr);
            List<String> tempList = map.getOrDefault(hash , new ArrayList<String>());
            tempList.add(strs[i]);
            map.put(hash, tempList);
        }

        return new ArrayList<>(map.values());
    }
}