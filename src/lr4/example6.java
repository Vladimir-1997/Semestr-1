package lr4;

import java.util.Random;
import java.util.Scanner;

public class example6 {
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
        System.out.println("После удаления строки и столбца");
        int[][] figure2 = new int[height-1][weidth-1];
        for (int i = 0; i < height-1; i++) {
            for (int j = 0; j < weidth-1; j++) {
                System.out.print(figure1[i][j] + " ");
            }
            System.out.println(" ");
                }
            }
        }
//Напишите программу, в которой создается и инициализируется
//двумерный числовой массив. Затем из этого массива удаляется строка и
//столбец (создается новый массив, в котором по сравнению с исходным
//удалена одна строка и один столбец). Индекс удаляемой строки и индекс
//удаляемого столбца определяется с помощью генератора случайных чисел.