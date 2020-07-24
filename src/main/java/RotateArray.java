import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

/**
 * @author Remigiusz Chomicki
 */
public class RotateArray {

    /**
     * print array as string
     * @param array
     */
    public void printArrayIntegers(final Integer[] array) {
        System.out.println(Arrays.toString(array));
    }

    /**
     * rotates an Integer[] array using left rotation
     * @param array
     * @param rotationsNumber
     */
    public void rotateArrayElements(Integer[] array, final int rotationsNumber) {
        IntStream.range(0, rotationsNumber).forEach(i -> Collections.rotate(Arrays.asList(array), -1));
    }

}
