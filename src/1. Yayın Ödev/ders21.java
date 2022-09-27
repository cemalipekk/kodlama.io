import java.util.Scanner;

public class ders21 {
    public static void main(String[] args) {
        //6 -->1,2,3
        //28-->1,2,4,7,14

        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.print("Sayi giriniz : ");
            int number = inp.nextInt();
            int total = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    total += i;
                }
            }

            if (total == number) {
                System.out.println("Mukemmel Sayidir");
            } else {
                System.out.println("Mukemmel Sayi degildir");
            }
        }
    }
}
