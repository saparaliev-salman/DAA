
import java.util.HashSet;

public class Solution {
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> visitedBag = new HashSet<>();
        ListNode current = head;

        while (current != null) {

            if (visitedBag.contains(current)) {
                return true;
            }

            visitedBag.add(current);
            current = current.next;
        }


        return false;
    }
}