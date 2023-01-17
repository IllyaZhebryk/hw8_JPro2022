package hw8;

public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();

        //Right array
        String[][] array = new String[4][4];
        array[0] = new String[] {"1", "2", "3", "4"};
        array[1] = new String[] {"1", "2", "3", "4"};
        array[2] = new String[] {"1", "2", "3", "4"};
        array[3] = new String[] {"1", "2", "3", "4"};
        System.out.println("Sum of the right array is :" + arrayValueCalculator.doCalc(array));

        //Wrong size
        String[][] arrayWrongSize = new String[3][4];
        array[0] = new String[] {"1", "2", "3", "4"};
        array[1] = new String[] {"1", "2", "3", "4"};
        array[2] = new String[] {"1", "2", "3", "4"};
        try {
            System.out.println("Sum of the right array is :" + arrayValueCalculator.doCalc(arrayWrongSize));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        //Wrong inner array (empty)
        String[][] arrayWrongInnerSizeEmpty = new String[4][];
        try {
            System.out.println("Sum of the right array is :" + arrayValueCalculator.doCalc(arrayWrongInnerSizeEmpty));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        //Wrong inner size
        String[][] arrayWrongInnerSize = new String[4][];
        arrayWrongInnerSize[0] = new String[] {"1", "2"};
        arrayWrongInnerSize[1] = new String[] {"1", "2", "3", "4"};
        arrayWrongInnerSize[2] = new String[] {"1", "2", "3", "4"};
        arrayWrongInnerSize[3] = new String[] {"1", "2", "3", "4"};
        try {
            System.out.println("Sum of the right array is :" + arrayValueCalculator.doCalc(arrayWrongInnerSize));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
