package lr3;

import java.util.Scanner;

public class example4_1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int a = id.nextInt();
        System.out.println("Введите второе целое число");
        int b = id.nextInt();

        if (a > b) { //
            for (int b1 = b; b1 <= a; b1++) {
                System.out.printf(" "+ b1);
            }
        } else {
            for (int a1 = a; a1 <= b; a1++) {
                System.out.printf(" "+ a1);
            }
        }
    }
}


