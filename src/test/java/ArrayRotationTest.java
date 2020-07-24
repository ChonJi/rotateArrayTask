import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Remigiusz Chomicki
 */
public class ArrayRotationTest {

    private Integer testArray[] = {1, 2, 3, 4};
    private final Integer reflectedTestArray[] = {1, 2, 3, 4};

    @Test(testName = "should rotate array elements as expected, RotateArray.class")
    public void shouldRotateArrayElementsUsingLeftRotation() {
        RotateArray rotateArray = new RotateArray();
        for (int i = 0; i < testArray.length; i++ ) {
            System.out.println(String.format("%s : %s", testArray[0], reflectedTestArray[i]));
            assertEquals(testArray[0], reflectedTestArray[i]);
            rotateArray.rotateArrayElements(testArray, 1);
        }
    }

    @Test(testName = "should rotate array elements reversing whole array, RotateArray.class")
    public void shouldRotateArrayElementsUsingLeftRotationReverseWholeArray() {
        RotateArray rotateArray = new RotateArray();
        for (int i = 0; i < testArray.length; i++ ) {
            System.out.println(String.format("%s : %s", testArray[0], reflectedTestArray[0]));
            assertEquals(testArray[0], reflectedTestArray[0]);
            rotateArray.rotateArrayElements(testArray, 4);
        }
    }

}
