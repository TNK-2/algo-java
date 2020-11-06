package linkedlist;

public class Node {

    private Object data;
    private Node nextNode;

    public Node (Object data) {
        this.data = data;
        this.nextNode = null;
    }

    public Node (Object data, Node nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }
    public Node getNextNode() {
        return this.nextNode;
    }

    public boolean hasNext() {
        return this.nextNode != null;
    }

    public Object getData() {
        return this.data;
    }
}
