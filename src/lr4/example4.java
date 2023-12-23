package lr4;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("введите высоту прямоугольника: ");
        int height = id.nextInt();
        int[][] figure = new int[height][];
        for (int i = 0; i < figure.length; i++) {
            int j = i + 1;
            figure[i]=new int[j];
        }
        for (int i = 0; i < height; i++) {//заполнение массива
            for (int j = 0; j < i + 1; j++) {
                figure[i][j] = 2;
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(figure[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

//Напишите программу, в которой создается двумерный массив, который
//выводит прямоугольный треугольник