class Solution {
    public boolean isPrefixString(String s, String[] words) {

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word);
            String temp = sb.toString();
            // System.out.println(temp);
            if (temp.equals(s))
                return true;
        }

        return false;
    }
}