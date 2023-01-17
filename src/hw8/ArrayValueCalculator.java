package hw8;

import hw8.exception.ArrayDataException;
import hw8.exception.ArraySizeException;

public class ArrayValueCalculator {

    public int doCalc(String[][] array) {
        if (array.length != 4) {
            throw new ArraySizeException(String.format("Wrong length of the array: %s, required: 4", array.length));
        }

        int sum = 0;
        for (int rowNumber = 0; rowNumber < array.length; rowNumber++) {
            String[] row = array[rowNumber];
            if (row == null) {
                throwArrayInnerSizeException(String.format("Wrong length of the inner array: %s, required: 4, "
                        + "row of the inner array is %s", 0, rowNumber));
            }
            for (int symbolNumber = 0; symbolNumber < row.length; symbolNumber++) {
                if (row.length != 4) {
                    throwArrayInnerSizeException(String.format("Wrong length of the inner array: %s, required: 4, "
                            + "row of the inner array is %s", row.length, rowNumber));
                }

                try {
                    sum += Integer.parseInt(row[symbolNumber]);
                } catch (Exception ex) {
                    throw new ArrayDataException(
                            String.format("Data is not a symbol in row %s, column %s", rowNumber, symbolNumber));
                }
            }
        }
        return sum;
    }

    private void throwArrayInnerSizeException(String msg) {
        throw new ArraySizeException(msg);
    }
}



