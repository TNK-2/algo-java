package doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append('a');
        list.append('b');
        list.append('c');
        list.insert('d');
        list.print();
        System.out.println("cを削除します。結果は以下です。");
        list.remove('c');
        list.print();
    }
}
