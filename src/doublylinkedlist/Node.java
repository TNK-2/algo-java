package doublylinkedlist;

public class Node {

    private Object data;
    private Node nextNode;
    private Node prevNode;

    public Node(Object data) {
        this.data = data;
        this.nextNode = null;
        this.prevNode = null;
    }

    public Node(Object data, Node nextNode, Node prevNode) {
        this.data = data;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public void setPrevNode(Node node) {
        this.prevNode = node;
    }

    public Node getPrevNode() {
        return this.prevNode;
    }

    public boolean hasNext() {
        return this.nextNode != null;
    }

    public Object getData() {
        return this.data;
    }
}
