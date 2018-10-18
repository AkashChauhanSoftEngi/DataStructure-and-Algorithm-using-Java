package alogorithm.ds.example.stack;

class StackUsingNode<T> {
	static class Node<T> {
		final T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

	Node<T> top;

	T pop() {
		if (top != null) {
			T item = top.data;
			top = top.next;
			return item;
		}
		return null;
	}

	void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top;
		top = t;
	}

	T peek() {
		return top.data;
	}

	public static void main(String[] args) {
		StackUsingNode<Integer> stack = new StackUsingNode<>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		System.out.println("Pop = " + stack.pop());
		System.out.println("Peek = " + stack.peek());
	}
}