package edu.weberstate.cs3230;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 3/22/17.
 */
class MainTest {

    @Test
    void method_reverses_single_word()
    {
        Assertions.assertEquals("gnitset", Main.reverseWords("testing"));
    }

    @Test
    void method_reverses_two_words_in_correct_order()
    {
        Assertions.assertEquals("olleh dlrow", Main.reverseWords("hello world"));
    }

    @Test
    void multiple_spaces_between_words_are_preserved()
    {
        Assertions.assertEquals("olleh   dlrow", Main.reverseWords("hello   world"));
    }

    @Test
    void spaces_at_start_are_preserved()
    {
        Assertions.assertEquals("     olleh   dlrow", Main.reverseWords("     hello   world"));
    }

    @Test
    void spaces_at_end_are_preserved()
    {
        Assertions.assertEquals("     olleh   dlrow   ", Main.reverseWords("     hello   world   "));
    }
}