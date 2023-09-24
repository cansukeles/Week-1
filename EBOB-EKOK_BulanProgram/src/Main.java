import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ebob = 0, ekok = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();

       /* for (int i = number1 / 2; i >= 1; i--) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                ebob = i;
            }
        }

        for(int i = 1; i <= number2; i++) {
            int number1Kat = number1 * i;
            if(number2 % number1Kat == 0) {
                ekok = number1Kat;
            }
        } */


        int i = number1 / 2;
        while ((number1 % i != 0) || (number2 % i != 0)) {
            i--;
        }
        ebob = i;
        ekok = (number1 * number2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
