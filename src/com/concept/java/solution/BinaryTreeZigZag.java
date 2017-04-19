package com.concept.java.solution;


import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/19/17
 * Time: 8:08 AM
 * To change this template use File | Settings | File Templates.
 */

/*
*
* Level order traversal in spiral form
*
*
* */

public class BinaryTreeZigZag extends Base {


    /*
    * Method Recursive
   * Time Complexity: Worst case time complexity of the above method is O(n^2). Worst case occurs in case of skewed trees.
   * */
    public void printSpiral(Node root) {
        if (null == root)
            return;
        int height = getHeight(root);
        boolean fromLeft = false;
        for (int i = 1; i <= height; i++) {
            printGivenLevel(root, i, fromLeft);
            fromLeft = !fromLeft;
        }
    }

    private int getHeight(Node node) {
        if (null == node)
            return 0;
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

    public void printGivenLevel(Node node, int level, boolean fromLeft) {
        if (null == node)
            return;
        if (level == 1)
            System.out.print(node.value+"\t");
        if (level > 1) {
            if (fromLeft) {
                printGivenLevel(node.left, level - 1, fromLeft);
                printGivenLevel(node.right, level - 1, fromLeft);
            } else {
                printGivenLevel(node.right, level - 1, fromLeft);
                printGivenLevel(node.left, level - 1, fromLeft);
            }
        }
    }


    /*
    * Method Iterative
    *     We can print spiral order traversal in O(n) time and O(n) extra space.
    *    The idea is to use two stacks. We can use one stack for printing from left to right and other stack for printing from right to left.
    *    In every iteration, we have nodes of one level in one of the stacks. We print the nodes, and push nodes of next level in other stack.
    *
    * time Complexity: is O(n). Space Complexity: O(n) extra space
    * */
    public void printSpiralUsingStack(Node root) {
        if (null == root)
            return;
        Stack<Node> stack1 = new Stack<Node>();
        Stack<Node> stack2 = new Stack<Node>();
        stack1.push(root);
        while (!stack1.empty() || !stack2.empty()) {
            while (!stack1.empty()) {
                Node temp = stack1.pop();
                if (temp.right != null)
                    stack2.push(temp.right);
                if (temp.left != null)
                    stack2.push(temp.left);
                System.out.print(temp.value + "\t");
            }
            while (!stack2.empty()) {
                Node temp = stack2.pop();
                if (temp.left != null)
                    stack1.push(temp.left);
                if (temp.right != null)
                    stack1.push(temp.right);
                System.out.print(temp.value + "\t");
            }
        }
    }
    
    
    public static void main(String args[]) {
        BinaryTreeZigZag zigZag = new BinaryTreeZigZag();
        Node root = zigZag.getBinaryTree();
        zigZag.printTree(root);
        System.out.println();
        zigZag.printSpiral(root);
        System.out.println();
        System.out.println("Using Stack");
        zigZag.printSpiralUsingStack(root);
    }
}
