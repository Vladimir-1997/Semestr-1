package lr4;

public class example1 {
    public static void main(String[] args) {
int figure = 11;
int i;
int j;
int z;
for (i=1; i<= figure; i++) {
    System.out.print("Номер строки: " + i +" ");
    z=0;
    for (j=-5; j<figure; j++) {
        System.out.print("+");
        z=z+1;
    }
    System.out.println("Количество символов в строке" + z);
}


    }
}

//Напишите программу, которая выводить в консольное окно
//прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11
//строк;