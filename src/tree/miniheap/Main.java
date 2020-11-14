package tree.miniheap;

public class Main {

    public static void main(String[] args) {
        MiniHeap miniHeap = new MiniHeap();
        miniHeap.push(5);
        miniHeap.push(6);
        miniHeap.push(2);
        miniHeap.push(9);
        miniHeap.push(13);
        miniHeap.push(11);
        miniHeap.push(1);
        miniHeap.push(13);
        miniHeap.push(11);
        miniHeap.push(1);
        miniHeap.push(131);
        miniHeap.push(111);
        miniHeap.push(11);
        miniHeap.push(0);
        miniHeap.push(0);
        miniHeap.push(8);
        System.out.println("aaaaa : " + miniHeap.getHeap().toString());
        miniHeap.pop();
        miniHeap.pop();
        miniHeap.pop();
        miniHeap.pop();
        miniHeap.pop();
        miniHeap.pop();
        miniHeap.pop();
        miniHeap.pop();
        System.out.println("bbbbb : " + miniHeap.getHeap().toString());
    }
}
