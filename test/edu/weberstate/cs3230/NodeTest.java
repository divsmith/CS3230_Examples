package edu.weberstate.cs3230;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 4/16/17.
 */
class NodeTest {
    @Test
    void returns_correct_value()
    {
        Node node = new Node(7);
        assertEquals(7, node.getValue());
    }

    @Test
    void setValue_works_correctly()
    {
        Node node = new Node();
        node.setValue(10);
        assertEquals(10, node.getValue());
    }

    @Test
    void addchild_works_correctly()
    {
        Node node = new Node();
        Node child = new Node();

        node.addChild(child);

        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(child);

        assertEquals(expected, node.getChildren());
    }

    @Test
    void addchild_works_correctly_with_multiple_children()
    {
        Node node = new Node();
        Node child1 = new Node();
        Node child2 = new Node();
        Node child3 = new Node();

        node.addChild(child1);
        node.addChild(child2);
        node.addChild(child3);

        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(child1);
        expected.add(child2);
        expected.add(child3);

        assertEquals(expected, node.getChildren());
    }

    @Test
    void returns_null_when_no_children()
    {
        Node node = new Node();
        assertEquals(null, node.getChildren());
    }

    @Test
    void value_default_value()
    {
        Node node = new Node();
        assertEquals(-1, node.getValue());
    }

    @Test
    void set_get_children_works_for_single_child()
    {
        Node parent = new Node();

        List<Main.INode> children = new ArrayList<Main.INode>();
        children.add(new Node(7));

        parent.setChildren(children);

        assertEquals(children, parent.getChildren());
    }

    @Test
    void set_get_children_works_for_multiple_children()
    {
        Node parent = new Node();

        List<Main.INode> children = new ArrayList<Main.INode>();
        children.add(new Node(7));
        children.add(new Node(8));
        children.add(new Node(9));
        children.add(new Node(10));

        parent.setChildren(children);

        assertEquals(children, parent.getChildren());
    }

    @Test
    void constructor_works_with_value_and_children()
    {
        List<Main.INode> children = new ArrayList<Main.INode>();
        children.add(new Node(7));
        children.add(new Node(8));
        children.add(new Node(9));
        children.add(new Node(10));

        Node parent = new Node(20, children);

        assertEquals(children, parent.getChildren());
        assertEquals(20, parent.getValue());
    }

}