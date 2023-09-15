import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;

        String chineseZodiac = "";

        //Kullanıcıdan doğum yılı verisi alınır.
        Scanner input = new Scanner(System.in);
        System.out.print("Please write the year you were born: ");
        year = input.nextInt();

        switch (year % 12) {
            case 0:
                chineseZodiac = "Monkey";
                break;
            case 1:
                chineseZodiac = "Rooster";
                break;
            case 2:
                chineseZodiac = "Dog";
                break;
            case 3:
                chineseZodiac = "Pig";
                break;
            case 4:
                chineseZodiac = "Rat";
                break;
            case 5:
                chineseZodiac = "Ox";
                break;
            case 6:
                chineseZodiac = "Tiger";
                break;
            case 7:
                chineseZodiac = "Rabbit";
                break;
            case 8:
                chineseZodiac = "Dragon";
                break;
            case 9:
                chineseZodiac = "Snake";
                break;
            case 10:
                chineseZodiac = "Horse";
                break;
            case 11:
                chineseZodiac = "Goat";

        }
        System.out.println("Chinese Zodiac is: " + chineseZodiac);
        input.close();
    }
}