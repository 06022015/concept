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

    /*
    * Given inorder and postorder traversal of a tree give the preorder traversal without creating the tree.
    * */
    private void forPreOrderTree(int inOrder[], int postOrder[],int iStart, int iEnd, int pStart, int pEnd){
        int index = search(inOrder, postOrder[pEnd],iStart,iEnd);
        System.out.print(inOrder[index]+"\t");
        if(index != iStart)
            forPreOrderTree(inOrder, postOrder, iStart, index-1,pStart, pStart+index-(iStart+1));
        if(index != iEnd)
            forPreOrderTree(inOrder, postOrder,  index+1, iEnd, pStart+index, pEnd-1);
    }


    /*
    * Given inorder and preorder traversal of a tree give the postorder traversal without creating the tree.
    * */
    private void forPostOrderTree(int inOrder[], int preOrder[],int iStart, int iEnd, int rootIndex){
        int index = search(inOrder, preOrder[rootIndex],iStart,iEnd);
        if(index != iStart)
            forPostOrderTree(inOrder, preOrder, iStart, index-1, rootIndex+1);
        if(index != iEnd)
            forPostOrderTree(inOrder, preOrder,  index+1, iEnd, rootIndex+1+index-iStart);
        System.out.print(inOrder[index]+"\t");
    }



    private int search(int inOrder[], int root,int start, int end){
        for (int i=start;i<=end;i++)
            if(inOrder[i]==root)
                return i;
        return -1;
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

        binaryTreeSerDes.printPreOrder(root);
        System.out.println();

        binaryTreeSerDes.printInOrder(root);
        System.out.println();
        binaryTreeSerDes.printPostOrder(root);
        System.out.println();
        int inOrder[] = {8,4,2,5,1,6,3,7};
        int postOrder[] = {8,4,5,2,6,7,3,1};
        int preOrder[] = {1,2,4,8,5,3,6,7};
        binaryTreeSerDes.forPreOrderTree(inOrder,postOrder, 0,inOrder.length-1, 0, postOrder.length-1);
        System.out.println();
        binaryTreeSerDes.forPostOrderTree(inOrder,preOrder, 0, inOrder.length-1, 0);
        System.out.println();

    }
}
