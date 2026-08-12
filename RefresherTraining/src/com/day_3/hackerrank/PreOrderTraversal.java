package com.day_3.hackerrank;
import java.util.*;
import java.io.*;

public class PreOrderTraversal {
    static class PreOrderNode {
        PreOrderNode left;
        PreOrderNode right;
        int data;

        PreOrderNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void preOrder(PreOrderNode root) {
        if(root == null){
            return;
        }
        
        System.out.print(root.data + " ");
        
        preOrder(root.left);
        
        preOrder(root.right);

    }

	public static PreOrderNode insert(PreOrderNode root, int data) {
        if(root == null) {
            return new PreOrderNode(data);
        } else {
            PreOrderNode cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        PreOrderNode root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }	
}
