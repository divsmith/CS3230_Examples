package edu.weberstate.cs3230;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 4/16/17.
 */
class EmptyNodeTest {
    @Test
    void returns_correct_value()
    {
        EmptyNode emptyNode = new EmptyNode(7);
        assertEquals(7, emptyNode.getValue());
    }

    @Test
    void setValue_works_correctly()
    {
        EmptyNode emptyNode = new EmptyNode();
        emptyNode.setValue(10);
        assertEquals(10, emptyNode.getValue());
    }

    @Test
    void addchild_works_correctly()
    {
        EmptyNode emptyNode = new EmptyNode();
        EmptyNode child = new EmptyNode();

        emptyNode.addChild(child);

        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(child);

        assertEquals(expected, emptyNode.getChildren());
    }

    @Test
    void addchild_works_correctly_with_multiple_children()
    {
        EmptyNode emptyNode = new EmptyNode();
        EmptyNode child1 = new EmptyNode();
        EmptyNode child2 = new EmptyNode();
        EmptyNode child3 = new EmptyNode();

        emptyNode.addChild(child1);
        emptyNode.addChild(child2);
        emptyNode.addChild(child3);

        List<Main.INode> expected = new ArrayList<Main.INode>();
        expected.add(child1);
        expected.add(child2);
        expected.add(child3);

        assertEquals(expected, emptyNode.getChildren());
    }

    @Test
    void returns_empty_when_no_children()
    {
        EmptyNode emptyNode = new EmptyNode();
        assertEquals(new ArrayList<Main.INode>(), emptyNode.getChildren());
    }

    @Test
    void value_default_value()
    {
        EmptyNode emptyNode = new EmptyNode();
        assertEquals(-1, emptyNode.getValue());
    }

    @Test
    void set_get_children_works_for_single_child()
    {
        EmptyNode parent = new EmptyNode();

        List<Main.INode> children = new ArrayList<Main.INode>();
        children.add(new EmptyNode(7));

        parent.setChildren(children);

        assertEquals(children, parent.getChildren());
    }

    @Test
    void set_get_children_works_for_multiple_children()
    {
        EmptyNode parent = new EmptyNode();

        List<Main.INode> children = new ArrayList<Main.INode>();
        children.add(new EmptyNode(7));
        children.add(new EmptyNode(8));
        children.add(new EmptyNode(9));
        children.add(new EmptyNode(10));

        parent.setChildren(children);

        assertEquals(children, parent.getChildren());
    }

    @Test
    void constructor_works_with_value_and_children()
    {
        List<Main.INode> children = new ArrayList<Main.INode>();
        children.add(new EmptyNode(7));
        children.add(new EmptyNode(8));
        children.add(new EmptyNode(9));
        children.add(new EmptyNode(10));

        EmptyNode parent = new EmptyNode(20, children);

        assertEquals(children, parent.getChildren());
        assertEquals(20, parent.getValue());
    }

}