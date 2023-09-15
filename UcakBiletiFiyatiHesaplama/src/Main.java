import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, age, tripType;
        double perKm = 0.10;

        //Kullanıcıdan mesafe, yaş ve yolculuk tipi verileri alınır.
        Scanner input = new Scanner(System.in);

        System.out.print("Please write the km: ");
        km = input.nextInt();

        System.out.print("Please write your age: ");
        age = input.nextInt();

        System.out.print("Please write the trip type (1-One Direction, 2-Round Trip): ");
        tripType = input.nextInt();


        if (((km < 0) || (age < 0)) || ((tripType < 0) || (tripType > 3))) {
            System.out.print("Invalid Transaction. Please try again.");
        } else {
            //Uçusun toplam fiyatı hesaplanır
            double price = km * perKm;

            double discount;

            //İndirimli Fiyat hesaplanır.
            if (age < 12) {
                discount = price * 0.50;
                price = price - discount;
            } else if ((age <= 24)) {
                discount = price * 0.10;
                price = price - discount;
            } else if (age > 65) {
                discount = price * 0.30;
                price = price - discount;
            }
            if (tripType == 2) {
                discount = price * 0.20;
                price = (price - discount) * 2;
            }

            System.out.print("Total amount: " + price + " TL");
        }


    }
}


