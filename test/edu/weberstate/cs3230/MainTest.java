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

        Node root = new Node(10);
        Node child1 = new Node(5);
        Node child2 = new Node(3);
        Node child3 = new Node(17);

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

        Node root = new Node(17);
        Node second = new Node(3);
        Node third = new Node(1);

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

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);

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

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        Node thirteen = new Node(13);
        Node fourteen = new Node(14);
        Node fifteen = new Node(15);
        Node sixteen = new Node(16);

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

        Node node = new Node(0);
        Node temp;
        expected.add(node);

        for (int i = 1; i < 1000000; i++)
        {
            temp = new Node(i);
            temp.addChild(node);

            expected.add(temp);

            node = temp;
        }

        assertEquals(expected, main.traverseTreeInDepth(node));

    }

}