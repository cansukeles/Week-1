import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner sınıfı oluşturulur
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = scan.nextInt();

        //yıldız için boşluk sayımız hesaplanır
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //yazdıracağımız yıldız sayısı hesaplanır.
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}