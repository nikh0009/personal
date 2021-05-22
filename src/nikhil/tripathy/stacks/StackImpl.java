package nikhil.tripathy.stacks;

/* A stack implementation the supports push(), pop(), 
 *findMiddle() and deleteMiddle() operations.
 * */
public class StackImpl {

	class DLLNode {
		DLLNode previous;
		DLLNode next;
		int data;

		DLLNode(int data) {
			this.data = data;
		}
	}

	/*
	 * Don't get confused, not an original stack. Just stores the reference of top
	 * element and mid element of "stack"(linked list).
	 */
	class MyStack {
		DLLNode head;
		DLLNode mid;
		int count;
	}

	MyStack createStack() {
		MyStack stack = new MyStack();
		stack.count = 0;
		return stack;
	}

	// You can assume it as adding node to DLL, plus updating the refs in mystack
	// class
	void push(MyStack stack, int data) {

		DLLNode node = new DLLNode(data);

		// As the element is at top, previous will always be null
		node.previous = null;

		// Will be null for first element added to stack.
		node.next = stack.head;

		stack.count++;

		if (stack.count == 1) {
			stack.mid = node;
		}

		else {
			stack.head.previous = node;

			if (stack.count % 2 != 0) {
				stack.mid = stack.mid.previous;
			}
		}

		stack.head = node;
	}

	int pop(MyStack stack) {

		if (stack.count == 0) {
			System.out.println("Stack underflow, can't pop");
			return -1;
		}
		int item = stack.head.data;
		stack.head = stack.head.next;

		if (stack.head != null) {
			stack.head.previous = null;
		}
		stack.count--;

		if (stack.count % 2 != 0) {
			stack.mid = stack.mid.next;
		}
		return item;
	}

	int findMiddle(MyStack stack) {

		if (checkEmpty(stack)) {
			System.out.println("Stack empty");
			return -1;
		} else
			return stack.mid.data;
	}
    //This could be half baked now, needs to be tested for edge cases.
	void deleteMiddle(MyStack stack) {
		if (checkEmpty(stack)) {
			System.out.println("Stack Empty, no middle element");
		} else {
			DLLNode curr = stack.mid;
			
			curr.previous = curr.next;
			curr.next.previous = curr.previous;
			stack.count --;
			
			if (stack.count %2 != 0) {
				stack.mid = curr.next;
			}
		}
	}

	boolean checkEmpty(MyStack stack) {
		if (stack.count == 0)
			return true;
		else
			return false;
	}
}
