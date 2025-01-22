package TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationTest {

    @Test
    public void correctPasswordTest()
    {
        //Arrange
        PasswordValidation validPass = new PasswordValidation();
        boolean expected = true;

        //Act
        boolean actual = validPass.check("passw?ord1");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThan8CharsTest()
    {
        //Arrange
        PasswordValidation validPass = new PasswordValidation();
        boolean expected = false;

        //Act
        boolean actual = validPass.check("pass1");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThan8CharsAndNoDigitsTest()
    {
        //Arrange
        PasswordValidation validPass = new PasswordValidation();
        boolean expected = false;

        //Act
        boolean actual = validPass.check("pass");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void noDigitsTest()
    {
        //Arrange
        PasswordValidation validPass = new PasswordValidation();
        boolean expected = false;

        //Act
        boolean actual = validPass.check("pass#word");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void noSpecialCharsTest()
    {
        //Arrange
        PasswordValidation validPass = new PasswordValidation();
        boolean expected = false;

        //Act
        boolean actual = validPass.check("passwo7rd");

        //Assert
        Assertions.assertEquals(expected, actual);
    }
}
