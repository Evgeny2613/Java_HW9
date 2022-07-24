// Напишите функцию, которая возвратит сумму всех положительных элементов двухмерного массива

package hw_9;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the two-dimensional array. Format A x B. " + '\n' + "Enter A:");
        int a = input.nextInt();
        System.out.println("Enter B:");
        int b = input.nextInt();

        int[][] array = new int[a][b];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the values of the array " + i + " (row by row):");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("The sum of the positive integers of the arrays is: " + sumOfArrays(array));
    }

    public static int sumOfArrays(int[][] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0)
                    sum += array[i][j];
            }
        }
        return sum;
    }
}
