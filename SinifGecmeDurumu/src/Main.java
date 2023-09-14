import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double Matematik, Fizik, Turkce, Kimya, Muzik, Ort;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        Matematik = input.nextDouble();

        System.out.print("Fizik Notunuz: ");
        Fizik = input.nextDouble();

        System.out.print("Turkce Notunuz: ");
        Turkce = input.nextDouble();

        System.out.print("Kimya Notunuz: ");
        Kimya = input.nextDouble();

        System.out.print("Muzik Notunuz: ");
        Muzik = input.nextDouble();

        Double avarage = (Matematik + Fizik + Turkce + Kimya + Muzik) / 5;
        if(avarage <= 55){
            System.out.println("Üzgünüz! Sınıfta Kaldınız");
        } else {
            System.out.println("Tebrikler! Sınıfı Geçtiniz");
        }
        System.out.println("Ortalamanız: " + avarage);
    }
}