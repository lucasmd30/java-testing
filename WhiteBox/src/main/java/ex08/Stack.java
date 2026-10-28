package ex08;

import java.util.EmptyStackException;

/** extraído de G. Fraser and A. Arcuri, "Whole Test Suite Generation," IEEE Transactions on Software
Engineering, vol. 39, iss. 2, pp. 276-291, 2013. **/
public class Stack {
    int[] values = new int[3];
    int size = 0;

    void push(int x) {
        if (size >= values.length)
            resize();
        if (size < values.length)
            values[size++] = x;
    }

    int pop() {
        if (size > 0)
            return values[size--];
        else
            throw new EmptyStackException();
    }

    private void resize() {
        int[] tmp = new int[values.length * 2];
        for (int i = 0; i < values.length; i++)
            tmp[i] = values[i];
        values = tmp;
    }
}
