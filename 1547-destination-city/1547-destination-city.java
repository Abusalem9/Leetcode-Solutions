class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> sourceSet = new HashSet<>();
        for (List<String> pair: paths) {       
            sourceSet.add(pair.get(0));
        }
        for (List<String> pair: paths) {
            if (!sourceSet.contains(pair.get(1))) {
                return pair.get(1);
            }
        }
        return null;
    }
}