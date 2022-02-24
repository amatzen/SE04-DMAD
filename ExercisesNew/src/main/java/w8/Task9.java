package w8;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class Task9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10,8,6,3,7,4,5,1,2));
        maxHeapInsert(list, 9);
        System.out.println(list);

    }

    public static int heapParent(int i) {
        return (int) Math.floor((i + 1) / 2) - 1;
    }

    public static void heapIncreaseKey(List<Integer> list, int i, int key) {
        int c = 0;
        if (key < list.get(i)) {
            throw new IllegalArgumentException("new key is smaller than current key");
        }
        list.set(i, key);
        while (i > 0 && list.get(heapParent(i)) < list.get(i)) {
            System.out.println("Step " + ++c + ": " + list);
            swap(list, i, heapParent(i));
            i = heapParent(i);
        }

    }

    public static void maxHeapInsert(List<Integer> list, int key) {
        list.add(Integer.MIN_VALUE);
        heapIncreaseKey(list, list.size() - 1, key);
    }
}
