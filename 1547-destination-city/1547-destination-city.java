class Solution {
    public String destCity(List<List<String>> paths) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        HashMap<String,String> map = new HashMap<>();

        for(List<String> path : paths){
            set.add(path.get(0));
            set.add(path.get(1));
            map.put(path.get(0),path.get(1));
        }

        for(String s : set){
            if(!map.containsKey(s)){
                return s;
            }
        }
        return null;
    }
}