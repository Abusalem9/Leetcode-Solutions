class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] split = sentence.split(" ");

        char last = split[0].charAt(split[0].length() - 1 );
        char first = split[0].charAt(0);
        for(int i = 1 ; i < split.length ; i++){
            if(last != split[i].charAt(0)){
                return false;
            }
            else{
                last = split[i].charAt(split[i].length() - 1);
            }
        }

        return first == last;
    }
}