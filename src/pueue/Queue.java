package pueue;

import java.util.Arrays;

public class Queue<T> {

    private T[] datas;

    public Queue() {
        datas = (T[]) new Object[0];
    }

    public void enqueue(T data) {
        T[] newDatas = (T[]) new Object[this.datas.length + 1];
        System.arraycopy(datas, 0, newDatas, 0, this.datas.length);
        datas = newDatas;
        datas[this.datas.length - 1] = data;
    }

    public T dequeue() {
        if (this.datas.length == 0) {
            return null;
        }
        T data = datas[0];
        T[] newDatas = (T[]) new Object[this.datas.length - 1];
        System.arraycopy(datas, 1, newDatas, 0, this.datas.length - 1);
        this.datas = newDatas;
        return data;
    }
}
