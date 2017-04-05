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

    @Test
    void single_space_at_end_are_preserved()
    {
        Assertions.assertEquals("     olleh   dlrow ", Main.reverseWords("     hello   world "));
    }

    @Test
    void long_sentences_are_reversed_correctly()
    {
        Assertions.assertEquals("sihT si a tset fo eht eleooT ytnuoC ycnegremE gninraW .metsyS", Main.reverseWords("This is a test of the Tooele County Emergency Warning System."));
    }
}