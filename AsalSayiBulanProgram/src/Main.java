public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean asalSayi = true;

            // Kendinden önceki sayılara bölünüp bölünmediğine göre asal sayı sorgulaması yapılır.
            for (int m = 2; m < i; m++) {
                if (i % m == 0) {
                    asalSayi = false;
                    break;
                }
            }
            if (asalSayi) {
                System.out.print(i + " ");
            }
        }
    }
}