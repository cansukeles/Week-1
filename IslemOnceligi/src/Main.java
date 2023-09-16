import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlanir.
        int a, b, c;

        //Kullanicidan inputlar alinir.
        Scanner scan = new Scanner(System.in);
        System.out.print("a sayısı: ");
        a = scan.nextInt();

        System.out.print("b sayısı: ");
        b = scan.nextInt();

        System.out.print("c sayısı: ");
        c = scan.nextInt();

        //islem sirasina gore sonuc alinir.
        int result = a + b * c - b;
        System.out.print("Sonuç: " + result);
    }
}