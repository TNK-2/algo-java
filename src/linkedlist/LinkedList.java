package linkedlist;

public class LinkedList {

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    /**
     * 末尾に要素を追加
     *
     * @param data
     */
    public void append(Object data) {
        if (data == null) {
            return;
        }

        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }

        Node lastNode = this.head;
        while (lastNode.hasNext()) {
            lastNode = lastNode.getNextNode();
        }

        lastNode.setNextNode(newNode);
    }

    /**
     * 先頭に要素を追加
     *
     * @param data
     */
    public void insert(Object data) {
        if (data == null) {
            return;
        }
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public void remove (Object data) {
        if (data == null) {
            return;
        }

        Node currentNode = this.head;

        // 対象要素が先頭要素だった場合
        if (currentNode != null && currentNode.getData().equals(data)) {
            this.head = currentNode.getNextNode();
            return;
        }

        Node previousNode = null;
        while (currentNode != null && !currentNode.getData().equals(data)) {
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }

        // ヒットしなかった場合
        if (currentNode == null) {
             return;
        }

        // ヒットした場合
        previousNode.setNextNode(currentNode.getNextNode());
    }

    public void print() {
        if (this.head == null) {
            return;
        }

        Node currentNode = this.head;
        System.out.println(currentNode.getData());
        while (currentNode.hasNext()) {
            currentNode = currentNode.getNextNode();
            System.out.println(currentNode.getData());
        }
    }
}
