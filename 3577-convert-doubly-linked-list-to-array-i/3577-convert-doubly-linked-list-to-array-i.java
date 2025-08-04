/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
};
*/

class Solution {
    public int[] toArray(Node head) {

        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }
}