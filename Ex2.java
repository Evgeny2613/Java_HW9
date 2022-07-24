/* Напишите функцию которая принимает одномерный массив и умножает на 3 все его положительные элементы,
 сохраняя их на прежние места. Пример [-10,2,4,-1] -> [-10, 6, 12, -1]
 */

package hw_9;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int arrayLength = input.nextInt();
        int[] array = new int[arrayLength];

        System.out.println("Enter the integer of the array (row by row):");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("The array is: " + Arrays.toString(arrayX3(array)));
    }

    public static int[] arrayX3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                array[i] *= 3;
        }
        return array;
    }
}
