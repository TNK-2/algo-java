package tree.miniheap;

import java.util.ArrayList;
import java.util.List;

public class MiniHeap {

    private List<Integer> heap;

    public MiniHeap() {
        heap = new ArrayList<>();
        heap.add(-1);
    }

    public List<Integer> getHeap() {
        return this.heap;
    }

    private int parentIndex(int index) {
        return index / 2;
    }

    private int leftChildIndex(int index) {
        return index * 2;
    }

    private int rightChildIndex(int index) {
        return (index * 2) + 1;
    }

    private void swap(int index1, int index2) {
        int tmp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, tmp);
    }

    private void heapfyUp(int index) {
        while (this.parentIndex(index) > 0) {
            if (this.heap.get(index) < this.heap.get(this.parentIndex(index))) {
                this.swap(index, this.parentIndex(index));
            }
            index = this.parentIndex(index);
        }
    }

    private void heapfyDown(int index) {
        while(this.leftChildIndex(index) <= this.heap.size() - 1) {
            int smallerChildIndex = this.smallerChildIndex(index);
            if (this.heap.get(index) > this.heap.get(smallerChildIndex)) {
                int tmp = this.heap.get(index);
                this.heap.set(index, this.heap.get(smallerChildIndex));
                this.heap.set(smallerChildIndex, tmp);
            }
            index = smallerChildIndex;
        }
    }

    private int smallerChildIndex(int index) {
        if (this.rightChildIndex(index) > this.heap.size() - 1) {
            return this.leftChildIndex(index);
        }

        if (this.heap.get(this.leftChildIndex(index)) > this.heap.get(this.rightChildIndex(index))) {
            return this.rightChildIndex(index);
        } else {
            return this.leftChildIndex(index);
        }
    }

    public void push(int value) {
        this.heap.add(value);
        this.heapfyUp(this.heap.size() - 1);
    }

    public Integer pop() {
        if (this.heap.size() == 1) {
            return null;
        }

        int root = this.heap.get(1);
        int data = this.heap.get(this.heap.size() - 1);
        this.heap.remove(this.heap.size() - 1);
        if (this.heap.size() == 1) {
            return root;
        }

        this.heap.set(1, data);
        this.heapfyDown(1);
        return root;
    }
}
