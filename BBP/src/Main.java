import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if ((day > 1) && (day <= 31)) {
                    if (day < 22) {
                        System.out.print("Oğlak Burcu");
                    } else {
                        System.out.print("Kova Burcu");
                    }
                }else {
                        System.out.print("Hatalı bir gün girdiniz!");
                    }
                    break;
                    default:
                        System.out.print("Hatalı bir ay girdiniz!");
                }
        }
    }