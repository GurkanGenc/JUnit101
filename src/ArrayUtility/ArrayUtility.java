package ArrayUtility;

import java.util.Arrays;

/**
 * A utility class for performing various operations on arrays.
 */
public class ArrayUtility {

    /**
     * Adds a value to an array at a specific index.
     *
     * Requirements:
     * - The array must be resized to fit the new value if the index is out of bounds.
     * - If the index is greater than the current size, the array should be padded with zeros.
     *
     * @param array the original array
     * @param index the index where the value should be added
     * @param value the value to add
     * @return the updated array
     */
    public int[] addValueAtIndex(int[] array, int index, int value) {
        if (array == null) {
            return null;
        }
        if (index >= array.length) {
            int[] newArray = Arrays.copyOf(array, index + 1);
            newArray[index] = value;
            return newArray;
        }
        array[index] = value;
        return array;
    }

    /**
     * Finds the maximum value in an array.
     *
     * Requirements:
     * - The array must not be null or empty.
     *
     * @param array the array to search
     * @return the maximum value, or Integer.MIN_VALUE if the array is null or empty
     */
    public int findMax(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Calculates the average of values in an array.
     *
     * Requirements:
     * - The array must not be null.
     * - If the array is empty, return 0.0.
     *
     * @param array the array to process
     * @return the average of the values in the array
     */
    public double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            return 0.0;
        }
        int sum = Arrays.stream(array).sum();
        return sum / array.length;
    }

    /**
     * Counts the number of even numbers in an array.
     *
     * Requirements:
     * - The array must not be null.
     * - Negative numbers should also be considered.
     *
     * @param array the array to process
     * @return the count of even numbers
     */
    public int countEvens(int[] array) {
        if (array == null) {
            return 0;
        }
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
            if (num == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Splits an array into two arrays: one with positive numbers and one with negatives.
     *
     * Requirements:
     * - The original array must not be modified.
     * - The method should handle arrays with mixed values correctly.
     *
     * @param array the array to split
     * @return a 2D array where the first row contains positive numbers
     *         and the second row contains negative numbers
     */
    public int[][] splitBySign(int[] array) {
        if (array == null) {
            return new int[2][];
        }
        int[] positives = Arrays.stream(array).filter(num -> num > 0).toArray();
        int[] negatives = Arrays.stream(array).filter(num -> num < 0).toArray();
        return new int[][]{positives, negatives};
    }

    /**
     * Adds values to an array, ensuring no more than 10 values are allowed.
     *
     * Requirements:
     * - The method should throw an IllegalArgumentException if the array exceeds 10 elements.
     *
     * @param values the values to add
     * @return the resulting array
     */
    public int[] addValuesLimited(int[] values) {
        if (values.length > 10) {
            throw new IllegalArgumentException("Array exceeds the maximum allowed size of 10.");
        }
        int[] result = new int[10];
        System.arraycopy(values, 0, result, 0, values.length);
        return result;
    }
}

