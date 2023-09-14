import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // boy ve kilo değişkenleri tanımlanır.
        int kilo;
        double boy, indeks;

        Scanner inp = new Scanner(System.in);

        //kullanıcıdan inputlar alınır.
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo = inp.nextInt();

        //Indeks hesaplanır.
        indeks = kilo / (boy * boy);


        System.out.println("Vücut Kitle İndeksiniz: " + indeks);



    }
}