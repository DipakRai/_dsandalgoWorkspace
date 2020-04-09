package io.mulshankar13.datastructures.thirtyday.leetcode;

public class MiddleOfALinkedList {

	public static void main(String[] args) {

		ListNode node = new ListNode(1);
		ListNode node2 = new ListNode(2);
		node.next = node2;
		ListNode node3 = new ListNode(3);
		node2.next = node3;
		ListNode node4 = new ListNode(4);
		node3.next = node4;
		ListNode node5 = new ListNode(5);
		node4.next = node5;
		
		//System.out.println(node.toString());
		
		System.out.println("middleNode:" + middleNode(node));
		
	}

	public static ListNode middleNode(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		if (head.next.next == null)
			return head.next;
		ListNode slowPointer = head.next;
		ListNode fastPointer = head.next.next;
		System.out.println(" slow before loop:"+slowPointer.val);
		System.out.println(" fast before loop:"+fastPointer.val);
		// 1->2->3->4
		while (fastPointer!= null && fastPointer.next != null) {
			System.out.println("slow"+slowPointer.next);
			System.out.println("fast:"+fastPointer.next);
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		return slowPointer;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}
	
}
