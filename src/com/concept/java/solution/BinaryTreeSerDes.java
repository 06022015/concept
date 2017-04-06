package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/4/17
 * Time: 11:23 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* Binary tree Serialize and de-serialize
* Pre-Order traversal
* http://www.programcreek.com/2014/05/leetcode-serialize-and-deserialize-binary-tree-java/
*
* */


public class BinaryTreeSerDes extends Base{

    public String serialize(Node root, StringBuilder sb){
        if(null==root){
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.value+",");
        serialize(root.left, sb);
        return serialize(root.right, sb);
    }

    public Node deSerialize(String content){
        if(null== content || "".equals(content))
            return null;

        String arr[] = content.split("\\,");
        int ind[] = {0};
        return deSerialize(arr, ind);
    }
    
    private Node  deSerialize(String input[], int[] index){
        if(null == input[index[0]] || "#".equals(input[index[0]]))
            return null;
        Node root = new Node(Integer.parseInt(input[index[0]]));
        index[0] = index[0]+1;
        root.left = deSerialize(input, index);
        index[0] = index[0]+1;
        root.right = deSerialize(input, index);
        return root;
    }
    
    public static void main(String args[]){
        BinaryTreeSerDes binaryTreeSerDes = new BinaryTreeSerDes();
        Node root = binaryTreeSerDes.getBinaryTree();
        binaryTreeSerDes.printTree(root);
        System.out.println();
        String serialize = binaryTreeSerDes.serialize(root, new StringBuilder());
        System.out.print(serialize);
        System.out.println();
        Node temp = binaryTreeSerDes.deSerialize(serialize);
        binaryTreeSerDes.printTree(temp);
    }
}
