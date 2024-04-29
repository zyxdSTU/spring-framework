package com.zy;

import java.util.LinkedList;

/**
 * @author zhouyu
 * @create 2023-12-07 16:28
 */
class MinStack {

	class ListNode {

		public int val;
		public ListNode next;

		public ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public LinkedList<ListNode> stack;
	public ListNode head;


	public MinStack() {
		LinkedList<ListNode> stack = new LinkedList<>();
		head = null;
	}

	public void push(int val) {
		ListNode newNode = new ListNode(val);

		//插入
		ListNode cur = head;
		ListNode pre = null;

		while (cur != null) {
			if (newNode.val > cur.val) {
				pre = cur;
				cur = cur.next;
			} else {
				pre.next = newNode;
				newNode.next = cur;
				break;
			}
			System.out.printf("pre: %d cur %d\n", pre.val, cur.val);
		}

		if (cur == null) {
			if (pre == null) {
				head = newNode;
			} else {
				pre.next = newNode;
			}
		}
	}

	public void pop() {
		ListNode oldNode = stack.pop();

		ListNode cur = head;
		ListNode pre = null;

		while (cur != null) {
			if (cur == oldNode) {
				if (pre == null) {
					head = cur.next;
					cur.next = null;
				} else {
					pre.next = cur.next;
					cur.next = null;
				}
				break;
			} else {
				cur = cur.next;
			}
		}
	}

	public int top() {
		return stack.peek().val;
	}

	public int getMin() {
		return head.val;
	}
}

public class Solution {
	public static void main(String args[]) {
		MinStack stack = new MinStack();
		stack.push(-2);
	}

}
