class Solution {
    public String removeStars(String s) {
        
        Stack<Character> stack = new Stack();

        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && ch == '*'){
                stack.pop();
            }
            else{
                stack.add(ch);
            }
        }

        StringBuilder res = new StringBuilder();

        while(!stack.isEmpty()){
            res.insert(0,stack.pop());
        }

        return res.toString();
    }
}