package edu.weberstate.cs3230;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parker on 4/16/17.
 */
public class NullNode implements Main.INode {
    int value = -1;
    List<Main.INode> children = null;

    public NullNode(int value, List<Main.INode> children)
    {
        setValue(value);
        setChildren(children);
    }

    public NullNode(int value)
    {
        setValue(value);
    }

    public NullNode()
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

    public void addChild(Main.INode child)
    {
        if (children == null)
        {
            children = new ArrayList<Main.INode>();
        }

        children.add(child);
    }
}
