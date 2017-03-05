package edu.weberstate.cs3230;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 3/4/17.
 */
class MainTest {
    @Test
    void negative_returns_negative_one()
    {
        Assertions.assertEquals(-1, Main.countWaysToJump(-1));
    }

    @Test
    void zero_returns_zero()
    {
        Assertions.assertEquals(0, Main.countWaysToJump(0));
    }

    @Test
    void one_returns_one()
    {
        Assertions.assertEquals(1, Main.countWaysToJump(1));
    }

    @Test
    void four_returns_five()
    {
        Assertions.assertEquals(5, Main.countWaysToJump(4));
    }

    @Test
    void five_returns_eight()
    {
        Assertions.assertEquals(8, Main.countWaysToJump(5));
    }

    @Test
    void _20_is_correct()
    {
        Assertions.assertEquals(10946, Main.countWaysToJump(20));
    }

    @Test
    void _45_is_correct()
    {
        Assertions.assertEquals(1836311903, Main.countWaysToJump(45));
    }
}