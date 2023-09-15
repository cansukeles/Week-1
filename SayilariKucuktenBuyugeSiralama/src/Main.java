import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner input = new Scanner(System.in);
        System.out.print("Please write the 1st number: ");
        num1 = input.nextInt();

        System.out.print("Please write the 2nd number: ");
        num2 = input.nextInt();

        System.out.print("Please write the 3rd number: ");
        num3 = input.nextInt();

        if ((num1 < num2) && (num1 < num3)) {
            if (num2 < num3) {
                System.out.print("1st number < 2nd number < 3rd number");
            } else {
                System.out.print("1st number < 3rd number < 2nd number");
            }
        } else if ((num2 < num3) && (num2 < num1)) {
            if (num1 < num3) {
                System.out.print("2nd number < 1st number < 3rd number");
            } else {
                System.out.print("2nd number < 3rd number < 1st number");
            }
        } else if ((num3 < num2) && (num3 < num1)) {
            if (num2 < num1) {
                System.out.print("3rd number < 2nd number < 1st number");
            } else {
                System.out.print("3rd number < 1st number < 2nd number");
            }
        }
    }
}