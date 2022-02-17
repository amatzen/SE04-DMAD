package w5;

public class Task5 {
    public static void main(String[] args) {
        int maxVal = 25;

        PermutationFinder pf = new PermutationFinder(maxVal);
        pf.randomize();
        System.out.println(pf.get());
    }

    private static int countCycles() {
        return 0;
    }
}
