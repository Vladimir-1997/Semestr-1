package lr4;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("введите ширину прямоугольника: ");
        int weidth = id.nextInt();
        System.out.print("введите высоту прямоугольника: ");
        int height = id.nextInt();
        int[][] figure = new int[height][weidth];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weidth; j++) {
                figure[i][j] = 2;
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weidth; j++) {
                System.out.print(figure[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
//Напишите программу, в которой создается двумерный массив, который
//выводи прямоугольник из цифр 2;