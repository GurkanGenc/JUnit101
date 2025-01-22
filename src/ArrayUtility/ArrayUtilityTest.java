package ArrayUtility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilityTest {

    @Test
    public void AddValueAtIndexTestInsideTheIndex()
    {
        //Arrange
        ArrayUtility arr = new ArrayUtility();
        int[] expected = {10, 20, 25, 40, 50};

        //Act
        int[] testArray = {10, 20, 30, 40, 50};
        int[] actual = arr.addValueAtIndex(testArray, 2, 25);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AddValueAtIndexTestOutsideTheIndex()
    {
        //Arrange
        ArrayUtility arr = new ArrayUtility();
        int[] expected = {10, 20, 30, 40, 50, 60};

        //Act
        int[] testArray = {10, 20, 30, 40, 50};
        int[] actual = arr.addValueAtIndex(testArray, 5, 60);

        //Assert
        Assertions.assertEquals(expected, actual);
    }
}
