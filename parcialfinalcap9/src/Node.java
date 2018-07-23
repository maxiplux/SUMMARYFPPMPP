

class Node {
		Object value;
		Node next;
		Node previous;

		Node(Node previous, Object item, Node next) {
			this.previous = previous;
			this.value = item;
			this.next = next;
		}

		public String toString() {
			return value+" ";
		}
	}