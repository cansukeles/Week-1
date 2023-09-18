import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please write a number: ");
        int n = scan.nextInt();
        System.out.print("Please write an exponential number: ");
        int k = scan.nextInt();

        int total = 1;
        for (int i = 1; i <= k; i++) {
            total *= n;

        }
        System.out.print("Result: " + total);
    }
}