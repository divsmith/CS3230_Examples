package edu.weberstate.cs3230;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseWords("test"));
    }

    public static String reverseWords(String words)
    {
        int wordStart = 0;
        int wordEnd = 0;
        String returnString = "";

        for (int i = 0; i < words.length() - 1; i++)
        {
            if (words.charAt(i) == ' ')
            {
                returnString = returnString.concat(" ");
            }
            else
            {
                wordStart = i;
                wordEnd = i;

                while (wordEnd < words.length() - 1 && words.charAt(wordEnd + 1) != ' ')
                {
                    wordEnd++;
                }

                returnString = returnString.concat(new StringBuilder(words.substring(wordStart, wordEnd + 1)).reverse().toString());
                wordStart = wordEnd;

                i = wordEnd;
            }
        }

        return returnString;
    }
}
