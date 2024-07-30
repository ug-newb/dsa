package org.leetcode;
import org.leetcode.ListNode;
public class lc_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int carry = 0;
        ListNode ptr = result;
        while(l1 != null || l2 != null) {
            int sum = carry + 0;
            if(l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            sum = sum % 10;

            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }
        if(carry == 1) {
            ptr.next = new ListNode(1);
        }
        return result.next;
    }
}
