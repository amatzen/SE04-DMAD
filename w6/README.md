# Uge 06
## Opgave 1
Both are linear, so both the average case and the worst case is $$\Theta(n)$$

## Opgave 2

$$A = \langle {\bf31,41},59,26,41,58 \rangle$$

$$A = \langle {\bf31,41,59},26,41,58 \rangle $$

$$A = \langle {\bf26,31,41,59},41,58 \rangle $$

$$A = \langle {\bf26,31,41,41,59},58 \rangle $$

$$A = \langle {\bf26,31,41,41,58,59} \rangle $$

## Opgave 3
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        int length = (int) Math.floor(Math.random()*40+1);

        System.out.println("Length: " + length);
        List<Integer> l = randomPermutation(length);
        System.out.println("Permutation: " + l);
        System.out.println("Sorted: " + insertionSort(l));
    }

    public static List<Integer> insertionSort(List<Integer> unordered) {
        for (int j = 1; j < unordered.size(); j++) {
            int k = unordered.get(j);
            int i = j - 1;

            while (i > -1 && unordered.get(i) > k) {
                unordered.set(i+1, unordered.get(i));
                i--;
            }

            unordered.set(i+1, k);
        }

        return unordered;
    }

    public static List<Integer> randomPermutation(int length) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        return list;
    }
}
```
