package doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append('a');
        list.append('b');
        list.append('c');
        list.insert('d');
        list.append('e');
        list.print();
        System.out.println("eを削除します。結果は以下です。");
        list.remove('e');
        list.print();
        System.out.println("dを削除します。結果は以下です。");
        list.remove('d');
        list.print();
        System.out.println("bを削除します。結果は以下です。");
        list.remove('b');
        list.print();
    }
}
