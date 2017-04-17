package edu.weberstate.cs3230;

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

        Main.INode node = new NullNode(10);
        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(node);

        assertEquals(expected, main.traverseTreeInDepth(node));
    }

    @Test
    void single_child_node_returns_correct_order()
    {
        Main main = new Main();

        NullNode root = new NullNode(10);
        NullNode child = new NullNode(5);

        root.addChild(child);

        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(child);
        expected.add(root);

        assertEquals(expected, main.traverseTreeInDepth(root));
    }

    @Test
    void three_child_nodes_returns_correct_order()
    {
        Main main = new Main();

        NullNode root = new NullNode(10);
        NullNode child1 = new NullNode(5);
        NullNode child2 = new NullNode(3);
        NullNode child3 = new NullNode(17);

        root.addChild(child1);
        root.addChild(child2);
        root.addChild(child3);

        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(child1);
        expected.add(child2);
        expected.add(child3);
        expected.add(root);

        assertEquals(expected, main.traverseTreeInDepth(root));
    }

    @Test
    void three_level_tree_returns_correct_order()
    {
        Main main = new Main();

        NullNode root = new NullNode(17);
        NullNode second = new NullNode(3);
        NullNode third = new NullNode(1);

        second.addChild(third);
        root.addChild(second);

        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(third);
        expected.add(second);
        expected.add(root);

        assertEquals(expected, main.traverseTreeInDepth(root));
    }

    @Test
    void complex_tree_returns_correct_order()
    {
        Main main = new Main();

        NullNode one = new NullNode(1);
        NullNode two = new NullNode(2);
        NullNode three = new NullNode(3);
        NullNode four = new NullNode(4);
        NullNode five = new NullNode(5);
        NullNode six = new NullNode(6);
        NullNode seven = new NullNode(7);

        one.addChild(two);
        one.addChild(three);
        two.addChild(four);
        two.addChild(five);
        three.addChild(six);
        three.addChild(seven);

        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(four);
        expected.add(five);
        expected.add(two);
        expected.add(six);
        expected.add(seven);
        expected.add(three);
        expected.add(one);

        assertEquals(expected, main.traverseTreeInDepth(one));
    }

    @Test
    void complex_tree_with_varying_number_of_children_returns_correct_order()
    {
        Main main = new Main();

        NullNode one = new NullNode(1);
        NullNode two = new NullNode(2);
        NullNode three = new NullNode(3);
        NullNode four = new NullNode(4);
        NullNode five = new NullNode(5);
        NullNode six = new NullNode(6);
        NullNode seven = new NullNode(7);
        NullNode eight = new NullNode(8);
        NullNode nine = new NullNode(9);
        NullNode ten = new NullNode(10);
        NullNode eleven = new NullNode(11);
        NullNode twelve = new NullNode(12);
        NullNode thirteen = new NullNode(13);
        NullNode fourteen = new NullNode(14);
        NullNode fifteen = new NullNode(15);
        NullNode sixteen = new NullNode(16);

        one.addChild(two);
        one.addChild(three);
        one.addChild(ten);
        two.addChild(four);
        two.addChild(five);
        two.addChild(six);
        three.addChild(nine);
        ten.addChild(fifteen);
        ten.addChild(sixteen);
        five.addChild(seven);
        five.addChild(eight);
        nine.addChild(eleven);
        nine.addChild(twelve);
        nine.addChild(thirteen);
        nine.addChild(fourteen);

        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(four);
        expected.add(seven);
        expected.add(eight);
        expected.add(five);
        expected.add(six);
        expected.add(two);
        expected.add(eleven);
        expected.add(twelve);
        expected.add(thirteen);
        expected.add(fourteen);
        expected.add(nine);
        expected.add(three);
        expected.add(fifteen);
        expected.add(sixteen);
        expected.add(ten);
        expected.add(one);

        assertEquals(expected, main.traverseTreeInDepth(one));
    }

    @Test
    void long_single_tree_returns_correctly()
    {
        Main main = new Main();

        List<Main.INode> expected = new ArrayList<>();

        NullNode nullNode = new NullNode(0);
        NullNode temp;
        expected.add(nullNode);

        for (int i = 1; i < 1000000; i++)
        {
            temp = new NullNode(i);
            temp.addChild(nullNode);

            expected.add(temp);

            nullNode = temp;
        }

        assertEquals(expected, main.traverseTreeInDepth(nullNode));

    }

}