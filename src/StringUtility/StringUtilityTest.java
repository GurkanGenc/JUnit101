package StringUtility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilityTest {

    @Test
    public void ReverseTest()
    {
        //Arrange
        StringUtility str = new StringUtility();
        String expected = "tset";

        //Act
        String actual = str.reverse("test");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PalindromeTest()
    {
        //Arrange
        StringUtility str = new StringUtility();
        boolean expected = true;

        //Act
        boolean actual = str.isPalindrome("anastas mum satsana");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CountVowelsTest()
    {
        //Arrange
        StringUtility str = new StringUtility();
        int expected = 4;

        //Act
        int actual = str.countVowels("Lorem ipsum");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CountVowelsTestNegative()
    {
        //Arrange
        StringUtility str = new StringUtility();
        int expected = 3;

        //Act
        int actual = str.countVowels("Lorem ipsum");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ReplaceSpacesTest()
    {
        //Arrange
        StringUtility str = new StringUtility();
        String expected = "Lorem@ipsum@dolor@sit@amet";

        //Act
        String actual = str.replaceSpaces("Lorem ipsum dolor sit amet", '@');

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void JoinWithCommaTest()
    {
        //Arrange
        StringUtility str = new StringUtility();
        String expected = "Lorem,ipsum,dolor,sit,amet";

        //Act
        String[] strArray = {"Lorem", "ipsum", "dolor", "sit", "amet"};
        String actual = str.joinWithComma(strArray);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShortestStringLengthTest()
    {
        //Arrange
        StringUtility str = new StringUtility();
        int expected = 3;

        //Act
        String[] strArray = {"Lorem", "ipsum", "dolor", "sit", "amet"};
        int actual = str.shortestStringLength(strArray);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SumOfDigitsTestNegative()
    {
        //Arrange
        StringUtility str = new StringUtility();
        int expected = 4;

        //Act
        int actual = str.sumOfDigits("137");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LongestWordTestNegative()
    {
        //Arrange
        StringUtility str = new StringUtility();
        String expected = "dolor";

        //Act
        String actual = str.longestWord("Lorem ipsum dolor sit amet");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AlphabeticTestNegative() // empty string returns true!
    {
        //Arrange
        StringUtility str = new StringUtility();
        boolean expected = true;

        //Act
        boolean actual = str.isAlphabetic("");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AverageOfDigitsTestNegative()
    {
        //Arrange
        StringUtility str = new StringUtility();
        double expected = 3;

        //Act
        double actual = str.averageOfDigits("Lorem24 7");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CountWordsTestNegative()
    {
        //Arrange
        StringUtility str = new StringUtility();
        int expected = 3;

        //Act
        int actual = str.countWords("Lorem ipsum dolor sit amet");

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ValidEmailTestNegative()
    {
        //Arrange
        StringUtility str = new StringUtility();
        boolean expected = true;

        //Act
        boolean actual = str.isValidEmail("karma.@");

        //Assert
        Assertions.assertEquals(expected, actual);
    }
}
