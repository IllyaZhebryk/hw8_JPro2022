package hw15;
import java.util.Arrays;

public class QuickSort {
            public static void quickSort(int[] array, int low, int high) {
                if (array.length == 0)
                    return;
                if (low >= high)
                    return;
                int middle = low + (high - low) / 2;
                int pivot = array[middle];
                int i = low, j = high;
                while (i <= j) {
                    while (array[i] < pivot) {
                        i++;
                    }
                    while (array[j] > pivot) {
                        j--;
                    }

                    if (i <= j) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        i++;
                        j--;
                    }
                }
                if (low < j)
                    quickSort(array, low, j);

                if (high > i)
                    quickSort(array, i, high);
            }
            public static void main(String[] args) {
                int[] arr = { 12, 0, 4, -6, 3, 7, 10, 12, -1 };
                System.out.println("Масив до сортування:");

                System.out.println(Arrays.toString(arr));

                int low = 0;
                int high = arr.length - 1;

                quickSort(arr, low, high);
                System.out.println("Відсортований масив: ");
                System.out.println(Arrays.toString(arr));
            }
}

