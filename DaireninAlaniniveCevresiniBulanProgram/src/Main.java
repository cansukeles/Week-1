import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int r;
       double pi = 3.14, a;

       Scanner inp = new Scanner(System.in);
       System.out.print("Dairenin Yarıçapını Giriniz: ");
       r = inp.nextInt();

       System.out.print("Dairenin Merkez Açısını Giriniz: ");
       a = inp.nextDouble();

       double alan = (pi * (r*r) * a) / 360;
       System.out.println("Dairenin Alanı: " + alan);



    }
}