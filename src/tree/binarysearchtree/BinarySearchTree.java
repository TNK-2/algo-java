package tree.binarysearchtree;

/**
 * https://www.udemy.com/course/python-algo/learn/lecture/21384626#questions
 */
public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node insert(Integer value) {
        return this.insert(this.root, value);
    }

    public Node insert(Node node, Integer value) {
        if (this.root == null) {
            this.root = new Node(value);
            return node;
        }

        if (node == null) {
            return new Node(value);
        }

        if (value < node.getValue()) {
            node.setLeft(this.insert(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(this.insert(node.getRight(), value));
        }

        return node;
    }

    public void inorder() {
        this.inorder(this.root);
    }

    public void inorder(Node node) {
        if (this.root == null || node == null) {
            return;
        }
        this.inorder(node.getLeft());
        System.out.println(node.getValue());
        this.inorder(node.getRight());
    }

    public boolean search(Integer value) {
       return this.search(this.root, value);
    }

    public boolean search(Node node, Integer value) {
        if (this.root == null || node == null) {
            return false;
        }

        if (node.getValue() == value) {
            return true;
        } else if (node.getValue() > value) {
            return search(node.getLeft(), value);
        } else {
            return search(node.getRight(), value);
        }
    }

    public Node remove(Integer value) {
        return this.remove(this.root, value);
    }

    public Node remove (Node node, Integer value) {
        if (this.root == null || node == null) {
            return null;
        }

        if (value < node.getValue()) {
            node.setLeft(this.remove(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(this.remove(node.getRight(), value));
        } else {
            if (node.getLeft() == null) {
                return node.getRight();
            } else if (node.getRight() == null) {
                return node.getLeft();
            }

            Node temp = this.minValue(node.getRight());
            node.setValue(temp.getValue());
            node.setRight(this.remove(node.getRight(), temp.getValue()));
        }
        return node;
    }

    private Node minValue (Node node) {
        Node currentNode = node;
        while (currentNode.getLeft() == null) {
            currentNode = currentNode.getLeft();
        }
        return currentNode;
    }

}
