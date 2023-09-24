import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler atanır

        int i = 0, toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        //Sayının bölenleri bulunur ve toplanır
        for (i = 1; i <= number * 0.5; i++) {
            if (number % i == 0) {
                toplam += i;
            }
            //Sayının bölenleri toplamı sayıya eşit mi kontrol edilir
        }
        if (toplam == number) {
            System.out.println(number + " is a perfect number!");
        } else {
            System.out.println(number + " isn't a perfect number!");
        }
    }
}