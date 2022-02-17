package w5;

public class Task4 {
    public static void main(String[] args) {
        int maxVal = 25;

        PermutationFinder pf = new PermutationFinder(maxVal);
        pf.randomize();
        System.out.println(pf.get());
    }
}

