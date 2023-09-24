import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, b, toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();


        while (number > 0) {
            b = number % 10;
            number /= 10;
            toplam += b;

        }
        System.out.println("Result: " + toplam);
    }
}