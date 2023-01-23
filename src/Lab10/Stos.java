package Lab10;

import java.util.LinkedList;

public class Stos<T> {
    LinkedList<T> list;

    public Stos() {
        this.list = new LinkedList<>();
    }

    public void push(T v) {
        list.push(v);
    }

    public T peek() {
        return list.peek();
    }

    public T pop() {
        return list.pop();
    }

    public boolean empty() {
        return list.isEmpty();
    }

    public String toString() {
        String result = "";
        for (var a : list) {
            result += a.toString();
        }

        return result;
    }
}
