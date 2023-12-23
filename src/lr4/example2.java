package lr4;

public class example2 {
    public static void main(String[] args) {
        int figure = 10; // число столбцов которое необходимо вывести
        int z = 0; // переменная необходима для вывода служебного сообщения о количестве символов в строке;
        for (int i = 1; i <= figure; i++) {
            System.out.print("номер строки: " + i + " ");
            for (int j = 0; j <= z; j++) {
                System.out.print("+");
            }
            z = z + 1;
            System.out.println(" Количество символов в строке " + z);
        }
    }
}

//Напишите программу, которая выводит в консольное окно
//прямоугольный треугольник;