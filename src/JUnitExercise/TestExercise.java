package JUnitExercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExercise {
    @Test
    public void firstTestCase()
    {
        String text = "some text";
        int actual = text.length();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void add()
    {
        //Arrange
        Calculator calc = new Calculator(2,3);
        int expected = 5;

        //Act
        int actual = calc.add();

        //Assert
        Assertions.assertEquals(expected, actual);
    }
}
