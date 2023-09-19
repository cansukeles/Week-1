import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int elemanSayisi = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Eleman sayısını yazınız: ");
        elemanSayisi = scan.nextInt();

        //Fibonacci 0 ve 1 değerlerini bildiğimiz için ilk başta değişkenlere atıyoruz.
        int fibZero = 0;
        int fibOne = 1;
        //Atadığımız değişkenleri her defasında arttırıyoruz.
        int fibMinusTwo = fibZero;
        int fibMinusOne = fibOne;

        System.out.println("1. fibonacci değeri: " + fibOne);

        for (int i = 2; i <= elemanSayisi; i++) {
            int currentFibValue = fibMinusOne + fibMinusTwo;
            System.out.println(i + ". fibonacci değeri: " + currentFibValue);

            fibMinusTwo = fibMinusOne;
            fibMinusOne = currentFibValue;

        }


    }
}