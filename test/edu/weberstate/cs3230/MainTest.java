package edu.weberstate.cs3230;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 4/16/17.
 */
class MainTest {
    @Test
    void empty_tree_returns_empty_list()
    {
        Main main = new Main();

        List<Main.INode> expected = new ArrayList<Main.INode>();

        assertEquals(expected, main.traverseTreeInDepth(null));
    }

    @Test
    void single_node_returns_single_node()
    {
        Main main = new Main();

        Main.INode node = new Node(10);
        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(node);

        assertEquals(expected, main.traverseTreeInDepth(node));
    }

    @Test
    void single_child_node_returns_correct_order()
    {
        Main main = new Main();

        Node root = new Node(10);
        Node child = new Node(5);

        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(child);
        expected.add(root);


    }

}