package hw15;

import java.util.Arrays;
import java.util.Random;

public class ShakeSort {
    public static void main(String[] args) {
        int temp;
        int arraySize = 10;
        int[] array = new int[arraySize];
        Random newRandom = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = newRandom.nextInt(10)+1;
            }
        System.out.println("Масив до сортування:");
        System.out.println(Arrays.toString(array));


        int leftSide = 0;
        int rightSide = array.length - 1;

        do {

            for (int i = leftSide; i < rightSide; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            rightSide--;
            for (int i = rightSide; i > leftSide; i--) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            leftSide++;
        } while (leftSide < rightSide);

        System.out.println("Масив після сортування:");
        System.out.println(Arrays.toString(array));
    }
}
