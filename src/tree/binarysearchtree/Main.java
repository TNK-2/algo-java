package tree.binarysearchtree;

public class Main {

    public static void main (String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(0);
        tree.insert(9);
        tree.insert(5);
        tree.insert(1);
        tree.insert(7);
        tree.insert(2);
        tree.insert(3);
        tree.insert(9);
        tree.insert(9);
        tree.insert(8);
        tree.insert(10);
        tree.insert(10);
        tree.insert(88);
        tree.insert(22);
        tree.insert(13);
        tree.insert(3);
        tree.inorder();
        System.out.println("search : 2 is " + tree.search(2));
        System.out.println("search : 9 is " + tree.search(9));
        System.out.println("search : 8 is " + tree.search(8));
        System.out.println("search : 10 is " + tree.search(10));
        System.out.println("search : 4 is " + tree.search(4));
        System.out.println("search : 0 is " + tree.search(0));

        System.out.println("remove : 3 is ");
        tree.remove(3);
        tree.inorder();
        System.out.println("remove : 9 is ");
        tree.remove(9);
        tree.inorder();
        System.out.println("remove : 1 is ");
        tree.remove(1);
        tree.inorder();
    }
}
