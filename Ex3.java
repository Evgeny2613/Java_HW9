/* Напишите функцию, которая принимает двухмерный массив и число
 и возвращает true если число в массиве содержится.
 */

package hw_9;

import java.util.Scanner;

public class Ex3 {
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

        System.out.println("Enter the integer you would like to find in the array: ");
        int number = input.nextInt();

        System.out.println("The result is: " + numberFind(array, number));
    }

    public static boolean numberFind(int[][] array, int number) {
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == number) {
                    check = true;
                    break;
                }
            }
        }
        return check;
    }
}
