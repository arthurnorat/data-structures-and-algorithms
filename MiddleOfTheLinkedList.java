package leetcode;

// Given the head of a singly linked list, return the middle node of the linked list.
// If there are two middle nodes, return the second middle node.

public class MiddleOfTheLinkedList {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Builds a linked list from the given values and returns its head.
    private static ListNode buildList(int[] values) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    // Returns the values from the given node to the end of the list, e.g. "[3, 4, 5]".
    private static String listToString(ListNode node) {
        StringBuilder builder = new StringBuilder("[");
        while (node != null) {
            builder.append(node.val);
            if (node.next != null) {
                builder.append(", ");
            }
            node = node.next;
        }
        return builder.append("]").toString();
    }

    public static void main(String[] args) {
        MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();

        ListNode result1 = solution.middleNode(buildList(new int[]{1, 2, 3, 4, 5}));
        System.out.printf("Test 1 - result: %s%n", listToString(result1));
        // expected: [3, 4, 5]

        ListNode result2 = solution.middleNode(buildList(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.printf("Test 2 - result: %s%n", listToString(result2));
        // expected: [4, 5, 6]

        ListNode result3 = solution.middleNode(buildList(new int[]{1}));
        System.out.printf("Test 3 - result: %s%n", listToString(result3));
        // expected: [1]
    }
}
