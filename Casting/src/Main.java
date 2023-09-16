import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int myInt;
        double myDouble;

        //Kullanıcıdan tam ve ondalıklı sayılar istenir.
        //Dönüşümler gerçekleştirilir.

        Scanner scan = new Scanner(System.in);
        System.out.print("Please write an integer: ");
        myInt = scan.nextInt();
        double sndDouble = myInt;
        System.out.println(sndDouble);


        System.out.print("Please write a decimal number: ");
        myDouble = scan.nextDouble();
        int sndInt = (int) myDouble;
        System.out.println(sndInt);

    }
}