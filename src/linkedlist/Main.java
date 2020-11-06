package linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append('a');
        list.append('b');
        list.append('c');
        list.append('d');
        list.print();
        System.out.println("bbbを削除します。結果は以下です。");
        list.remove('c');
        list.print();
    }
}
