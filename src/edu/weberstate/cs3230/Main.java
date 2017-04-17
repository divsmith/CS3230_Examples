package edu.weberstate.cs3230;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static interface INode {
        int getValue();
        List<INode> getChildren();
    }

    public static List<INode> traverseTreeInDepth(INode root) {
        List<INode> results = new ArrayList<INode>();

        Deque<INode> workingStack = new ArrayDeque<INode>();
        Deque<INode> resultStack = new ArrayDeque<INode>();

        // No node was passed in.
        // Return empty list.
        if (root == null)
        {
            return results;
        }

        workingStack.push(root);

        while (workingStack.size() > 0)
        {
            resultStack.push(workingStack.pop());

            // Check for either null or an empty list
            if (resultStack.peek() != null && resultStack.peek().getChildren() != null && resultStack.peek().getChildren().size() > 0)
            {
                for (INode node : resultStack.peek().getChildren())
                {
                    workingStack.push(node);
                }
            }
        }

        while (resultStack.size() > 0)
        {
            results.add(resultStack.pop());
        }

       return results;
    }
}
