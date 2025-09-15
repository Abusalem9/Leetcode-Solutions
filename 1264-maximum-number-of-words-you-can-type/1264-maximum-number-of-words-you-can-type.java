class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        Set<Character> set = new HashSet<>();

        for(char ch: brokenLetters.toCharArray()){
            set.add(ch);
        }
        
        int count = 0;
        String[] hold = text.split(" ");
        for(String s : hold){
            boolean f = false;
            for(char ch : s.toCharArray()){
                if(set.contains(ch)){
                    f = true;
                    break;
                }
            }
            if(!f) count++;
        }
        return count;
    }
}