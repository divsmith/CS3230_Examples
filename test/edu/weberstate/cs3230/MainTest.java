package edu.weberstate.cs3230;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 4/16/17.
 */
class MainTest {
    @Test
    void empty_tree_returns_empty_list()
    {
        Main main = new Main();

        assertEquals(null, main.traverseTreeInDepth(null));
    }

    @Test
    void single_node_returns_single_node()
    {
        Main main = new Main();
        //Main.INode node = new Main.INode()
    }
}