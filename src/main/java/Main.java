import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a command and its arguments: ");
            String input = scanner.next();

            if (input.equals("add")) {
                int n1 = scanner.nextInt();
                int n2 = scanner.nextInt();

                System.out.println(calculator.add(n1, n2));
            } else if (input.equals("binary")) {
                int n1 = scanner.nextInt();
                System.out.println(calculator.intToBinaryNumber(n1));
            } else if (input.equals("subtract")) {

                int n1 = scanner.nextInt();
                int n2 = scanner.nextInt();

                System.out.println(calculator.subtract(n1, n2));
            } else if (input.equals("fib")) {
                int n1 = scanner.nextInt();
                System.out.println(calculator.fibonacciNumberFinder(n1));
            } else if (input.equals("divide")) {

                int n1 = scanner.nextInt();
                int n2 = scanner.nextInt();

                System.out.println(calculator.divide(n1, n2));
            } else if (input.equals("multiply")) {

                int n1 = scanner.nextInt();
                int n2 = scanner.nextInt();

                System.out.println(calculator.multiply(n1, n2));
            } else {
                break;
            }
        }
        System.out.println("bye!");
        scanner.close();
    }
}
