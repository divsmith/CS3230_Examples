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

    public static List<INode> traverseTreeInDepth(INode node) {
    /*
      Please implement this method to
      traverse the tree in depth and return a list of all passed nodes.

      The method shall work optimally with large trees.
     */

        List<INode> results = new ArrayList<INode>();

        Deque<INode> stack = new ArrayDeque<INode>();

//        if (node.getChildren().size() > 0)
//        {
//            for (int i = node.getChildren().size() - 1; i > 0; i--)
//            {
//                stack.push(node.getChildren().get(i));
//            }
//        }
//        else
//        {
//
//        }

        if (node == null)
        {
            return results;
        }

        if (node.getChildren() == null || node.getChildren().size() == 0)
        {
            results.add(node);
        }
        else
        {
            for (int i = node.getChildren().size() - 1; i > 0; i--)
            {
                stack.push(node.getChildren().get(i));
            }
        }


        return results;
    }
}
