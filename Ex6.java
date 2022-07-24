/* Напишите функцию, которая возвратит сумму элементов только из тех подмассивов двухмерного массива,
 в которых нет отрицательных элементов. Пример  [[1,2,3], [-10], [1, -3],[10]] -> 16
 */

package hw_9;

import java.util.Scanner;

public class Ex6 {
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

        System.out.println("The sum of the arrays where no negative integers present is: " + positiveArray(array));
    }

    public static int positiveArray(int[][] array) {
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0)
                    break;
                else counter++;
            }
            if (counter == array[i].length){
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
            }
            counter = 0;
        }
        return sum;
    }
}




