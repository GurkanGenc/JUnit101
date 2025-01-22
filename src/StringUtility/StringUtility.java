package StringUtility;

import java.util.Arrays;

/**
 * A utility class for performing various string operations.
 */
public class StringUtility {

    /**
     * Reverses the input string.
     *
     * @param input the string to reverse
     * @return the reversed string, or null if the input is null
     */
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Checks if the input string is a palindrome.
     *
     * Requirements:
     * - A palindrome reads the same forward and backward.
     * - The comparison should be case-insensitive.
     * - Whitespace and punctuation should be ignored.
     *
     * @param input the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    /**
     * Counts the number of vowels in the input string.
     *
     * Requirements:
     * - Vowels include 'a', 'e', 'i', 'o', 'u' (case-insensitive).
     *
     * @param input the string to process
     * @return the count of vowels, or 0 if the input is null
     */
    public int countVowels(String input) {
        if (input == null) {
            return 0;
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }

    /**
     * Replaces all spaces in the input string with a given character.
     *
     * Requirements:
     * - All spaces should be replaced.
     * - The method should handle empty strings correctly.
     *
     * @param input       the string to process
     * @param replacement the character to replace spaces with
     * @return the updated string, or null if the input is null
     */
    public String replaceSpaces(String input, char replacement) {
        if (input == null) {
            return null;
        }
        return input.replace(' ', replacement);
    }

    /**
     * Joins an array of strings with a comma as the delimiter.
     *
     * Requirements:
     * - Null elements in the array should be treated as empty strings.
     * - If the input array is null, return an empty string.
     *
     * @param strings the array of strings to join
     * @return a single comma-separated string
     */
    public String joinWithComma(String[] strings) {
        if (strings == null) {
            return "";
        }
        return String.join(",", strings);
    }

    /**
     * Finds the length of the shortest string in an array.
     *
     * Requirements:
     * - If the array is empty or null, return 0.
     *
     * @param strings the array of strings
     * @return the length of the shortest string
     */
    public int shortestStringLength(String[] strings) {
        if (strings == null || strings.length == 0) {
            return 0;
        }
        return Arrays.stream(strings)
                .mapToInt(String::length)
                .min()
                .orElse(0);
    }

    /**
     * Calculates the sum of all numeric digits in the input string.
     *
     * Requirements:
     * - Ignore non-numeric characters.
     * - If the input is null or contains no digits, return 0.
     *
     * @param input the string to process
     * @return the sum of digits in the string
     */
    public int sumOfDigits(String input) {
        if (input == null) {
            return 0;
        }
        return input.chars()
                .filter(Character::isDigit)
                .map(c -> c - '0')
                .sum();
    }

    /**
     * Returns the longest word in the input string.
     *
     * Requirements:
     * - Words are separated by spaces.
     * - If the input is null or empty, return null.
     *
     * @param input the string to process
     * @return the longest word
     */
    public String longestWord(String input) {
        if (input == null || input.trim().isEmpty()) {
            return null;
        }
        String[] words = input.split(" ");
        return Arrays.stream(words)
                .max((a, b) -> a.length() - b.length())
                .orElse("");
    }

    /**
     * Checks if the string contains only alphabetic characters.
     *
     * Requirements:
     * - Alphabetic characters include A-Z and a-z.
     * - Whitespace and punctuation should return false.
     *
     * @param input the string to check
     * @return true if the string contains only alphabetic characters, false otherwise
     */
    public boolean isAlphabetic(String input) {
        if (input == null) {
            return false;
        }
        return input.chars().allMatch(Character::isLetter);
    }

    /**
     * Calculates the average of all numeric digits in the input string.
     *
     * Requirements:
     * - Ignore non-numeric characters.
     * - If no digits are present, return 0.0.
     *
     * @param input the string to process
     * @return the average of the digits
     */
    public double averageOfDigits(String input) {
        if (input == null || input.isEmpty()) {
            return 0.0;
        }
        long count = input.chars().filter(Character::isDigit).count();
        int sum = input.chars()
                .filter(Character::isDigit)
                .map(c -> c - '0')
                .sum();
        return count == 0 ? 0.0 : (double) sum / count;
    }

    /**
     * Counts the number of words in the input string.
     *
     * Requirements:
     * - Words are separated by whitespace.
     * - If the input is null or empty, return 0.
     *
     * @param input the string to process
     * @return the number of words
     */
    public int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        return input.trim().split("\\s+").length;
    }

    /**
     * Validates if the input string is a properly formatted email address.
     *
     * Requirements:
     * - The string must contain exactly one '@'.
     * - The string must contain at least one '.' after the '@'.
     *
     * @param email the string to validate
     * @return true if the string is a valid email, false otherwise
     */
    public boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.contains("@") && email.contains(".");
    }
}

