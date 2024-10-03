class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(0);  // Dummy node
        ListNode current = head;

        while (l1 != null || l2 != null || carry > 0) {
            int x = (l1 != null) ? l1.val : 0; // Get value from l1
            int y = (l2 != null) ? l2.val : 0; // Get value from l2

            int sum = carry + x + y; // Calculate the sum
            carry = sum / 10; // Calculate carry

            current.next = new ListNode(sum % 10); // Create new node
            current = current.next; // Move to the next node

            if (l1 != null) l1 = l1.next; // Move l1 pointer
            if (l2 != null) l2 = l2.next; // Move l2 pointer
        }

        return head.next; // Return the next node after dummy node
    }
}

