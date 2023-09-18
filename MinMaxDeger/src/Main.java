import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int adet = scan.nextInt();

        int small = 1, big = 1;
        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi = scan.nextInt();

            if (i == 1) {
                small = sayi;
                big = sayi;
            } else if (sayi < small) {
                small = sayi;
            } else if (sayi > big) {
                big = sayi;
            }
        }
        System.out.println("En büyük sayı: " + big);
        System.out.println("En küçük sayı: " + small
        );
    }
}