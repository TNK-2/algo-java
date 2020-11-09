package tree.binarysearchtree;

public class Node {
    private Integer value;
    private Node left;
    private Node right;

    public Node(Integer value) {
        this.value = value;
    }

    public Node getLeft() {
        return this.left;

    }

    public Node getRight() {
        return this.right;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
