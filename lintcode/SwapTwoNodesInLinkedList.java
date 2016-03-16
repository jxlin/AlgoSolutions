/*
 * Given a linked list and two values v1 and v2. Swap the two nodes in the linked list with values v1 and v2. It's guaranteed there is no duplicate values in the linked list. If v1 or v2 does not exist in the given linked list, do nothing.

 Notice

You should swap the two nodes with values v1 and v2. Do not directly swap the values of the two nodes.

Example
Given 1->2->3->4->null and v1 = 2, v2 = 4.

Return 1->4->3->2->null.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SwapTwoNodesInLinkedList {

    /**
     * @param head a ListNode
     * @oaram v1 an integer
     * @param v2 an integer
     * @return a new head of singly-linked list
     */
    public ListNode swapNodes(ListNode head, int v1, int v2) {
        ListNode cur = head;
        ListNode cur1 = null;
        ListNode cur2 = null;
        boolean isV1Exist = false;
        boolean isV2Exist = false;
        while (cur != null) {
            if (cur.val == v1) {
                cur1 = cur;
            }
            if (cur.val == v2) {
                cur2 = cur;
            }
            cur = cur.next;
        }
    }

}
