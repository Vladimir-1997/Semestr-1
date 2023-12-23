package lr3;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner id= new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int a = id.nextInt();

        int sum = 0;
        for (int i = 0; a > 0; i++) {
            if ((i % 5 == 2)&(i % 3 == 1)) {
                System.out.printf("%d, ", i);
                sum = sum + i;
                a--;
            }
        }
        System.out.printf("сумма чисел=" + sum);
    }
    }

//Напишите программу, в которой вычисляется сумма чисел,
//удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
//вводится пользователем. Программа отображает числа, которые
//суммируются, и значение суммы. Предложите версии программы,
//использующие разные операторы цикла.