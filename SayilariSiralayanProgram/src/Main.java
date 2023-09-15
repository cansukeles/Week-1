import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, number3;

        Scanner input = new Scanner(System.in);
        System.out.print("Please write the 1st number: ");
        number1 = input.nextInt();

        System.out.print("Please write the 2nd number: ");
        number2 = input.nextInt();

        System.out.print("Please write the 3rd number: ");
        number3 = input.nextInt();

        if((number1 > number2) && (number1 > number3)) {
            if((number2 > number3)) {
                System.out.print("1st number > 2nd number > 3rd number");
            }else{
                System.out.print("1st number > 3rd number > 2nd number");
            }
        }else if((number2 > number1) && (number2 > number3)) {
            if (number3 > number1) {
                System.out.print("2nd number > 3rd number > 1st number");
            }
        }else {
        if(number1 > number2) {
            System.out.print("3rd number > 1st number > 2nd number");
        }else {
            System.out.print("3rd number > 2nd number > 1st number");
        }
        }
    }
}