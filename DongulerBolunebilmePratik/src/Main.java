import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please write a number: ");
        int k = scan.nextInt();

        double total = 0;
        int count = 0;
        for (int i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                total = total + i;
                count++;
            }
        }
        double avg = total / count;
        System.out.println("Average: " + avg);
    }
}