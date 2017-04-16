package edu.weberstate.cs3230;

import java.util.List;

/**
 * Created by parker on 4/16/17.
 */
public class Node implements Main.INode {
    int value = -1;
    List<Main.INode> children = null;

    public Node(int value, List<Main.INode> children)
    {
        setValue(value);
        setChildren(children);
    }

    public Node(int value)
    {
        setValue(value);
    }

    public Node()
    {
        setValue(-1);
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public void setChildren(List<Main.INode> children)
    {
        this.children = children;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public List<Main.INode> getChildren() {
        return this.children;
    }
}
