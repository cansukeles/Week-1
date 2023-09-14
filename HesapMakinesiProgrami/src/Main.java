import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        num1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        num2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        if(select == 1){
            System.out.print("Toplam = " + (num1 + num2));
        }else if (select == 2){
            System.out.print("Çıkarma = " + (num1 - num2));
        }else if (select == 3){
            System.out.print("Çarpma= " + (num1 * num2));
        }else if (select == 4) {
            if(num2 != 0) {
                System.out.print("Bölme = " + (num1 / num2));
            }else if (num2 == 0){
                System.out.print("Bir sayı 0'a bölünemez!");
            }
        }else {
            System.out.print("Yanlış Seçim Yaptınız. Tekrar deneyiniz. ");
        }


    }
}