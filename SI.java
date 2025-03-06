import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.printf("Simple Interest: %.2f%n", simpleInterest);
        System.out.printf("Total Amount: %.2f%n", principal + simpleInterest);

        scanner.close();
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}

/*%.2f:

%: Indicates the start of a format specifier.

.2: Specifies that the number should be rounded to two decimal places.

f: Indicates that the number is a floating-point number.

%n:

%n: Inserts a platform-independent line separator. 
This means it will use the correct newline character(s) for the operating system it's running on */
