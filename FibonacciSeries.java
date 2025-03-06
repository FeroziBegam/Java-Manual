public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series till " + n + " terms:");

        // Print the first two terms
        System.out.print(firstTerm + " " + secondTerm);

        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
