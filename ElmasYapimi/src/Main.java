import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");
        int basamakSayisi = scan.nextInt();

        for (int i = 1; i <= basamakSayisi; i++) {
            for (int k = 1; k <= basamakSayisi - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = basamakSayisi - 1; a > 0; a--) {
            for(int m = 1; m <= basamakSayisi - a; m++) {
               System.out.print(" ");
            }
            for (int b = 1; b <= (2*a) -1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

