import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> l = randomPermutation(7);
        System.out.println(insertionSort(l));
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

        return null;
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
