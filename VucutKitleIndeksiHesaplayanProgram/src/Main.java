import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy, indeks;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo = inp.nextInt();

        double in = kilo / (boy * boy);


        System.out.println("Vücut Kitle İndeksiniz: " + in);



    }
}