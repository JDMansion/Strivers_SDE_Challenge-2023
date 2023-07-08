import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        printList(head1);
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode temp = dummy;
        int carry = 0;

        while(head1 != null || head2 != null || carry == 1) {
            int sum = 0;
            if(head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }

            if(head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }

            sum += carry;
            carry = sum/10;
            LinkedListNode node = new LinkedListNode(sum % 10);
            temp.next = node;
            temp = node;
        }
        return dummy.next;
    }
}
