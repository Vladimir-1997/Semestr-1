package lr3;

import java.util.Scanner;

public class example3_2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите количество чисел Фибоначчи");
        int x = id.nextInt();
        {
            int i = x;
            long k = 0;
            long l = 1;
            long m = 1;
            while (i > 0) {

                m = k + l;
                System.out.printf(m + " ");
                k = l;
                l = m;
                i--;

            }

        }
    }
}