package processor;

class Node {
	private final int object;
    private Node next;

    public Node(int i) {
        this.object = i;
        this.next = null;
    }

    public int getObject() {
        return object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
