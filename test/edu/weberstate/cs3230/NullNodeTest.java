package edu.weberstate.cs3230;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 4/16/17.
 */
class NullNodeTest {
    @Test
    void returns_correct_value()
    {
        NullNode nullNode = new NullNode(7);
        assertEquals(7, nullNode.getValue());
    }

    @Test
    void setValue_works_correctly()
    {
        NullNode nullNode = new NullNode();
        nullNode.setValue(10);
        assertEquals(10, nullNode.getValue());
    }

    @Test
    void addchild_works_correctly()
    {
        NullNode nullNode = new NullNode();
        NullNode child = new NullNode();

        nullNode.addChild(child);

        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(child);

        assertEquals(expected, nullNode.getChildren());
    }

    @Test
    void addchild_works_correctly_with_multiple_children()
    {
        NullNode nullNode = new NullNode();
        NullNode child1 = new NullNode();
        NullNode child2 = new NullNode();
        NullNode child3 = new NullNode();

        nullNode.addChild(child1);
        nullNode.addChild(child2);
        nullNode.addChild(child3);

        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(child1);
        expected.add(child2);
        expected.add(child3);

        assertEquals(expected, nullNode.getChildren());
    }

    @Test
    void returns_null_when_no_children()
    {
        NullNode nullNode = new NullNode();
        assertEquals(null, nullNode.getChildren());
    }

    @Test
    void value_default_value()
    {
        NullNode nullNode = new NullNode();
        assertEquals(-1, nullNode.getValue());
    }

    @Test
    void set_get_children_works_for_single_child()
    {
        NullNode parent = new NullNode();

        List<Main.INode> children = new ArrayList<Main.INode>();
        children.add(new NullNode(7));

        parent.setChildren(children);

        assertEquals(children, parent.getChildren());
    }

    @Test
    void set_get_children_works_for_multiple_children()
    {
        NullNode parent = new NullNode();

        List<Main.INode> children = new ArrayList<Main.INode>();
        children.add(new NullNode(7));
        children.add(new NullNode(8));
        children.add(new NullNode(9));
        children.add(new NullNode(10));

        parent.setChildren(children);

        assertEquals(children, parent.getChildren());
    }

    @Test
    void constructor_works_with_value_and_children()
    {
        List<Main.INode> children = new ArrayList<Main.INode>();
        children.add(new NullNode(7));
        children.add(new NullNode(8));
        children.add(new NullNode(9));
        children.add(new NullNode(10));

        NullNode parent = new NullNode(20, children);

        assertEquals(children, parent.getChildren());
        assertEquals(20, parent.getValue());
    }

}