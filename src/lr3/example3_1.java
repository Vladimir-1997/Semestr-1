package lr3;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args){
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество чисел Фибоначчи");
        int size = id.nextInt();
        int[] nums = new int[size];
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 0; i < nums.length; i++){
            n2=n0+n1;
            n0=n1;
            n1=n2;
            System.out.print(n2+" ");
        }
        System.out.println();
    }
}
