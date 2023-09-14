import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double u, alan;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. kenar uzunluğu: ");
        a = inp.nextInt();

        System.out.print("2. kenar uzunluğu: ");
        b = inp. nextInt();

        System.out.print("3. kenar uzunluğu: ");
        c = inp.nextInt();


        double cevre = (a + b + c);
        System.out.println("Üçgenin Çevresi: " + cevre);

        u = cevre / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Üçgenin Alanı: " + alan);







    }
}