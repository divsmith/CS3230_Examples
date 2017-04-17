package edu.weberstate.cs3230;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by parker on 4/16/17.
 */
public class MainTest_EmptyNode {
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

        Main.INode node = new EmptyNode(10);
        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(node);

        assertEquals(expected, main.traverseTreeInDepth(node));
    }

    @Test
    void single_child_node_returns_correct_order()
    {
        Main main = new Main();

        EmptyNode root = new EmptyNode(10);
        EmptyNode child = new EmptyNode(5);

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

        EmptyNode root = new EmptyNode(10);
        EmptyNode child1 = new EmptyNode(5);
        EmptyNode child2 = new EmptyNode(3);
        EmptyNode child3 = new EmptyNode(17);

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

        EmptyNode root = new EmptyNode(17);
        EmptyNode second = new EmptyNode(3);
        EmptyNode third = new EmptyNode(1);

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

        EmptyNode one = new EmptyNode(1);
        EmptyNode two = new EmptyNode(2);
        EmptyNode three = new EmptyNode(3);
        EmptyNode four = new EmptyNode(4);
        EmptyNode five = new EmptyNode(5);
        EmptyNode six = new EmptyNode(6);
        EmptyNode seven = new EmptyNode(7);

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

        EmptyNode one = new EmptyNode(1);
        EmptyNode two = new EmptyNode(2);
        EmptyNode three = new EmptyNode(3);
        EmptyNode four = new EmptyNode(4);
        EmptyNode five = new EmptyNode(5);
        EmptyNode six = new EmptyNode(6);
        EmptyNode seven = new EmptyNode(7);
        EmptyNode eight = new EmptyNode(8);
        EmptyNode nine = new EmptyNode(9);
        EmptyNode ten = new EmptyNode(10);
        EmptyNode eleven = new EmptyNode(11);
        EmptyNode twelve = new EmptyNode(12);
        EmptyNode thirteen = new EmptyNode(13);
        EmptyNode fourteen = new EmptyNode(14);
        EmptyNode fifteen = new EmptyNode(15);
        EmptyNode sixteen = new EmptyNode(16);

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

        EmptyNode emptyNode = new EmptyNode(0);
        EmptyNode temp;
        expected.add(emptyNode);

        for (int i = 1; i < 1000000; i++)
        {
            temp = new EmptyNode(i);
            temp.addChild(emptyNode);

            expected.add(temp);

            emptyNode = temp;
        }

        assertEquals(expected, main.traverseTreeInDepth(emptyNode));

    }
}
