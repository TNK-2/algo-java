package doublylinkedlist;

public class DoublyLinkedList {

    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public DoublyLinkedList(Node head) {
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
        newNode.setPrevNode(lastNode);
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

        if (this.head == null) {
            this.head = newNode;
        }

        this.head.setPrevNode(newNode);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public void remove(Object data) {
        if (data == null) {
            return;
        }

        Node currentNode = this.head;

        // 先頭要素がヒット
        if (currentNode != null && currentNode.getData().equals(data)) {
            // 1要素(先頭)しか存在しない
            if (currentNode.getNextNode() == null) {
                this.head = null;
                return;
            } else {
                Node nextNode = currentNode.getNextNode();
                nextNode.setPrevNode(null);
                this.head = nextNode;
                return;
            }
        }

        // 削除対象がヒットするまで、もしくは全要素分(ヒットなし)回す
        while (currentNode != null && !currentNode.getData().equals(data)) {
            currentNode = currentNode.getNextNode();
        }

        // ヒットしなかった場合
        if (currentNode == null) {
            return;
        }

        // ヒットした要素が末尾の場合
        if (currentNode.getNextNode() == null) {
            currentNode.getPrevNode().setNextNode(null);
            return;
        } else {
            Node prevNode = currentNode.getPrevNode();
            Node nextNode = currentNode.getNextNode();
            prevNode.setNextNode(nextNode);
            nextNode.setPrevNode(prevNode);
        }
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
