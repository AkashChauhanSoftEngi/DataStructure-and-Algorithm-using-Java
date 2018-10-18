package alogorithm.ds.example.queue;

class QueueUsingNode<T> {
	static class Node<T> {
		final T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

	Node<T> first, last;

	void enqueue(T item) {
		if (first == null) {
			last = new Node<T>(item);
			first = last;
		} else {
			last.next = new Node<T>(item);
			last = last.next;
		}
	}

	T dequeue() {
		if (first != null) {
			T item = first.data;
			first = first.next;
			return item;
		}
		return null;
	}

	public static void main(String[] args) {
		QueueUsingNode<Integer> test = new QueueUsingNode<>();
		test.enqueue(100);
		test.enqueue(200);
		test.enqueue(300);
		System.out.println("test = " + test.dequeue());
	}
}