package edu.weberstate.cs3230;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.isPalindrome("ababbaba"));
        System.out.println(main.isPalindrome("abaabba"));
        System.out.println(main.isPalindrome("fishies"));
        System.out.println(main.isPalindrome("racecar"));
    }

    public boolean isPalindrome(String testString)
    {
        for (int x = 0; x < testString.length() / 2; x++)
        {
            // Test the first and last characters for equality,
            // then move in one character for each.
            if (testString.charAt(x) != testString.charAt(testString.length() - (x + 1)))
            {
                return false;
            }
        }

        return true;
    }
}
