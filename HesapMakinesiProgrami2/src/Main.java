import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        num1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        num2 = input.nextInt();

       System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam = " + (num1 + num2));
                break;
            case 2:
                System.out.print("Çıkarma = " + (num1 - num2));
                break;
            case 3:
                System.out.print("Çarpma = " + (num1 * num2));
                break;
            case 4:
                if(num2 == 0) {
                    System.out.print("Bir Sayı Sıfıra Bölünemez!");
                }else {
                    System.out.print("Bölüm = " + (num1 / num2));
                }
                break;
            default:
                System.out.print("Hatalı giriş yaptınız!");
        }

    }
}