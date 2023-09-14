import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //meyve ve kg fiyat değişkenleri tanımlanır.
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;

        //kullanıcıdan inputlar alınır.
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo?: ");
        double armutKilo = input.nextDouble();

        System.out.print("Elma kaç kilo?: ");
        double elmaKilo = input.nextDouble();

        System.out.print("Domates kaç kilo?: ");
        double domatesKilo = input.nextDouble();

        System.out.print("Muz kaç kilo?: ");
        double muzKilo = input.nextDouble();

        System.out.print("Patlıcan kaç kilo?: ");
        double patlicanKilo = input.nextDouble();

        //Toplam ücret hesaplanır.
        double toplam = (armutKilo * armut) + (elmaKilo * elma) + (domatesKilo * domates) + (muzKilo * muz) + (patlicanKilo * patlican);
        System.out.println("Toplam Tutar: " + toplam + " TL");

    }
}