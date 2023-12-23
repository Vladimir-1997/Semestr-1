package lr3;

import java.util.Scanner;

public class example4_2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int a = id.nextInt();
        System.out.println("Введите второе целое число");
        int b = id.nextInt();

        if (a > b) {
            while (a >= b) {
                System.out.printf(" " +b);
                b++;
            }
        } else {
            while (a <= b) {
                System.out.printf(" " +a);
                a++;
            }
        }
    }
}


