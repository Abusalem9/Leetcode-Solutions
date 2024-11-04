import java.util.LinkedList;

class Solution {
    public String simplifyPath(String path) {
        LinkedList<String> stack = new LinkedList<>();

        for (String s : path.split("/")) {
            if (s.equals("") || s.equals(".")) {
                continue; // Skip empty parts and current directory
            } else if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.removeLast(); // Go up to the parent directory
                }
            } else {
                stack.addLast(s); // Add valid directory to the stack
            }
        }

        StringBuilder res = new StringBuilder();
        for (String dir : stack) {
            res.append("/").append(dir); // Construct the simplified path
        }

        return res.length() == 0 ? "/" : res.toString(); // Handle the case where the path is empty
    }
}
