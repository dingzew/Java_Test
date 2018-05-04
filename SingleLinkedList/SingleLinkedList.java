import java.util.Iterator;

public class SingleLinkedList<Item> implements Iterable<Item>{
	private ListNode head;

	public SingleLinkedList(ListNode head) {
		this.head = head;
	}


	public static class ListNode<Item> {
		public ListNode next;
		public Item value;
		public ListNode(Item value, ListNode node) {
			this.next = node;
			this.value = value;
		}
	}

	public Iterator iterator() {
		return new ListIterator();
	}

	private class ListIterator implements Iterator<Item> {
		private ListNode curr = head;

		public boolean hasNext() {
			return curr != null;
		}

		public Item next() {
			Item returnVal = (Item)curr.value;
			curr = curr.next;
			return returnVal;
		}

		public void remove() {
			throw new java.lang.UnsupportedOperationException();
		}

	}


	public static void main(String[] args) {
		ListNode head = new ListNode<Integer>(1, null);
		head.next = new ListNode<Integer>(2, null);
		head.next.next = new ListNode<Integer>(3, null);
		SingleLinkedList list = new SingleLinkedList(head);
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}