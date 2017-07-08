package com.concept.java.tree;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 3/31/17
 * Time: 10:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindDistanceBwKey extends Base {

    private int findLevel(Node node, int key, int lvl) {
        if (null == node)
            return -1;
        if (node.value == key)
            return lvl;
        int level = findLevel(node.left, key, lvl + 1);
        return level != -1 ? level : findLevel(node.right, key, lvl + 1);
    }

    private Node findCommonDistance(Node root, int key1, int key2) {
        if (null == root)
            return null;
        if (root.value == key1 || root.value == key2) {
            return root;
        }
        Node leftLCA = findCommonDistance(root.left, key1, key2);
        Node rightLCA = findCommonDistance(root.right, key1, key2);
        if (null != leftLCA && null != rightLCA) {
            return root;
        }
        return null != leftLCA ? leftLCA : rightLCA;
    }

    public int findDistance(Node root, int key1, int key2) {
        int dist1 = findLevel(root, key1, 1)-1;
        int dist2 = findLevel(root, key2, 1)-1;
        Node lca = findCommonDistance(root, key1, key2);
        int lcaLevel =  findLevel(root, lca.value,1)-1;
        return dist1+dist2-2*lcaLevel;
    }

    public static void main(String args[]) {
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        FindDistanceBwKey findDistanceBwKey = new FindDistanceBwKey();
        System.out.println("Key 4,5: - "+ findDistanceBwKey.findDistance(root, 4,5));
        System.out.println("Key 4,6: - "+ findDistanceBwKey.findDistance(root, 4,6));
        System.out.println("Key 3,4: - "+ findDistanceBwKey.findDistance(root, 3,4));
        System.out.println("Key 2,4: - "+ findDistanceBwKey.findDistance(root, 2,4));
        System.out.println("Key 8,5: - "+ findDistanceBwKey.findDistance(root, 8,5));
    }
}
