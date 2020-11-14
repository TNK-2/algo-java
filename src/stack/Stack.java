package stack;

import java.util.Arrays;

public class Stack<T> {

    private T[] datas;

    public Stack() {
        this.datas = (T[]) new Object[0];
    }

    public void push(T data) {
        datas = Arrays.copyOf(this.datas, this.datas.length + 1);
        datas[this.datas.length - 1] = data;
    }

    public T pop() {
        if (this.datas.length == 0) {
            return null;
        }
        T data = datas[datas.length - 1];
        datas = Arrays.copyOf(this.datas, datas.length - 1);
        return data;
    }
}
