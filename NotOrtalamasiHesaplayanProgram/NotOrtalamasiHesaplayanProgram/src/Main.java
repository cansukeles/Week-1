import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler oluşturuldu.
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfı tanımlandı.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerler alınıyor.
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: " + sonuc);

        boolean kosul = sonuc < 60;

        String str = (kosul) ? "Sınıfta Kaldı" : "Sınıfı Geçti";

        System.out.print(str);


    }
}