import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Write the year: ");
        year = input.nextInt();

        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.print(year + " is a leap year");
        }else {
            System.out.print(year + " isn't a leap year");
        }
    }
}