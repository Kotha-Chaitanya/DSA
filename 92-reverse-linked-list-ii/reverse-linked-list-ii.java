class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move to the left position
        ListNode before = dummy;

        int pos = 1;

        while (pos < left) {
            before = before.next;
            pos++;
        }

        // Start reversing
        ListNode curr = before.next;
        ListNode prev = null;

        int count = right - left + 1;

        while (count > 0) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;

            count--;
        }

        // Connect the reversed part
        before.next.next = curr;
        before.next = prev;

        return dummy.next;
    }
}