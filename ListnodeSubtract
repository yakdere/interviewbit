/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode subtract(ListNode A) {
        int l = 0;
        ListNode head = A;
        ArrayList<Integer> values = new ArrayList<Integer>();
        while (A != null) {
            values.add(A.val);
            A = A.next;
            l++;
        }
        ListNode modifiedHead = head;
        for (int i=0; i < l/2; i++) {
            int newValue = values.get(l-i-1) - values.get(i);
            head.val = newValue;
            head = head.next;
        }
        return modifiedHead;
    }
}