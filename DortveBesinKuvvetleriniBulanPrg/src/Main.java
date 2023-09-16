import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please write a number: ");
        n = scan.nextInt();

        for(int i = 1; i <= n; i *= 4){
            System.out.println(i);
        }
        for(int k = 1; k <= n; k *= 5){
            System.out.println(k);
        }
    }
}