import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Remigiusz Chomicki
 */
public class ListRotationTest {

    private Integer testArray[] = {1, 2, 3, 4};
    private final Integer reflectedTestList[] = {1, 2, 3, 4};

    @Test(testName = "should rotate list elements as expected, RotateList.class")
    public void shouldRotateListElementsUsingLeftRotation() {
        RotateArray rotateArray = new RotateArray();
        for (int i = 0; i < testArray.length; i++ ) {
            System.out.println(String.format("%s : %s", testArray[0], reflectedTestList[i]));
            Assert.assertEquals(testArray[0], reflectedTestList[i]);
            rotateArray.rotateListElements(testArray, 1);
        }
    }

}
