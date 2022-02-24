package w8;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class Task11 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(27,17,3,16,13,10,1,5,7,12,4,8,9,0));
        System.out.println(list);
        maxHeapify(list, 0);;

        System.out.println(list);
    }

    public static void maxHeapify(List<Integer> list, int i) {
        int l = left(i);
        int r = right(i);
        int largest;

        if (l < list.size() && list.get(l) > list.get(i)) {
            largest = l;
        } else {
            largest = i;
        }

        if (r < list.size() && list.get(r) > list.get(largest)) {
            largest = r;
        }

        if (largest != i) {
            swap(list, i, largest);
            maxHeapify(list, largest);
        }


    }

    public static int right(int i) {
        return 2*i + 2;
    }

    public static int left(int i) {
        return 2*i + 1;
    }
}
