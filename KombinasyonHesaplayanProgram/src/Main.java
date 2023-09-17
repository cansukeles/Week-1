import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int r;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please write a number: ");
        n = scan.nextInt();

        System.out.print("Please write a second number (less than the first number): ");
        r = scan.nextInt();

        long nFak = 1;

        for (int i = 1; i <= n; i++) {
            nFak = nFak * i;

        }
        long rFak = 1;
        for (int i = 1; i <= r; i++) {
            rFak = rFak * i;

        }
        long nrFak = 1;
        for (int i = 1; i <= (n - r); i++) {
            nrFak = nrFak * i;
        }
        System.out.println("nFak : " + nFak);
        System.out.println("rFak : " + rFak);
        System.out.println("nrFak : " + nrFak);

        long result = nFak / (rFak * nrFak);
        System.out.println("Combination result: " + result);
    }
}