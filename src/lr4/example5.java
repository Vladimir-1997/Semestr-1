package lr4;

import java.util.Random;
import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        Random random = new Random();
        System.out.print("введите ширину прямоугольника: ");
        int weidth = id.nextInt();
        System.out.print("введите высоту прямоугольника: ");
        int height = id.nextInt();
        int[][] figure1 = new int[height][weidth];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weidth; j++) {
                figure1[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weidth; j++) {
                System.out.print(figure1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        int[][] figure2 = new int[weidth][height];
        for (int i = 0; i < weidth; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(figure1[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}
//Напишите программу, в которой создается двумерный целочисленный
//массив. Он заполняется случайными числами. Затем в этом массиве строи и
//столбцы меняются местами: первая строка становится первым столбцом,
//вторая строка становиться вторым столбцом и так далее. Например, если
//исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//из 5 строк и 3 столбцов