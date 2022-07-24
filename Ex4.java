/* Напишите функцию, которая принимает двухмерный массив и возвращает количество подмассивов,
 в которых нет отрицательных элементов. Пример: [[1,2,3], [-10], [1, -3]] -> 1
 */

package hw_9;

import java.util.Scanner;

public class Ex4 {
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

        System.out.println("The amount of positive arrays is: " + positiveArrays(array));
    }

    public static int positiveArrays(int[][] array){
        int counter = array.length;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0){
                    counter--;
                    break;
            }
        }
    }
        return counter;
}}
