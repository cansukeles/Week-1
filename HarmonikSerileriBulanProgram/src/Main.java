import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please write a number: ");
        int n = scan.nextInt();
        double result = 0;

        for (double i = 1; i <= n; i++) {
            result += (1/i);
        }
        System.out.print("Result: " + result);
    }
}