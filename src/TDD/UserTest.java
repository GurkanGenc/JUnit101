package TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void userTest()
    {
        //Arrange
        User user = new User("John", "1234");
        User expected = user;

        //Act
        User actual = user;

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getUserNameTest()
    {
        //Arrange
        User user = new User("Jane", "123");
        String expected = "Jane";

        //Act
        String actual = user.getUserName();

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPassword() {
        User user = new User("staffan82", "password123");
        //Hämta det sparade användarnamnet staffan82 ifrån objektet user
        String actual = user.getPassword();
        String expected = "password123";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPasswordTest()
    {
        //Arrange
        User user = new User("Joe", "123456");
        String expected = "123456";

        //Act
        String actual = user.getPassword();

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeUserNameTest()
    {
        //Arrange
        User user = new User("Joey", "123");
        String expected = "Tom";

        //Act
        String actual = user.changeUserName("Tom");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void atLeast4CharsUsernameTest()
    {
        //Arrange
        User user = new User("Joel", "123");
        String expected = "Tomas";

        //Act
        String actual = user.checkUsernameLength("Tomas");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void atLeast4CharsUsernameTest2()
    {
        //Arrange
        User user = new User("Joel", "123");
        String expected = "Joel";

        //Act
        String actual = user.checkUsernameLength("Tom");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changePasswordTest()
    {
        //Arrange
        User user = new User("name", "pass");
        String expected = "newpass";

        //Act
        String actual = user.changePassword("newpass");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSpecialCharsInPasswordTest()
    {
        //Arrange
        User user = new User("Joe", "123!");
        boolean expected = true;

        //Act
        boolean actual = user.checkSpecialCharsInPassword();

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getUserTypeTest()
    {
        //Arrange
        User user = new User("joe", "123");
        String expected = "normal";

        //Act
        String actual = user.getUserType();

        //Assert
        Assertions.assertEquals(expected, actual);
    }
}
