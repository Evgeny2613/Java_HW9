//Создайте двухмерный массив 10х10 и заполните его цифрами от 99 до 0

package hw_9;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        int counter = 99;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = counter;
                counter--;
            }
        }
        for (int i = 0; i < array.length; i++) {
                System.out.println(Arrays.toString(array[i]));
        }
    }
}
