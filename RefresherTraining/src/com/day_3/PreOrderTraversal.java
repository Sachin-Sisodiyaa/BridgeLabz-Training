package com.day_3;
import java.util.*;
import java.io.*;

class PreOrderTraversal {
    PreOrderTraversal left;
    PreOrderTraversal right;
    int data;
    
    PreOrderTraversal(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void preOrder(PreOrderTraversal root) {
        if(root == null){
            return;
        }
        
        System.out.print(root.data + " ");
        
        preOrder(root.left);
        
        preOrder(root.right);

    }

	public static PreOrderTraversal insert(PreOrderTraversal root, int data) {
        if(root == null) {
            return new PreOrderTraversal(data);
        } else {
            PreOrderTraversal cur;
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
        PreOrderTraversal root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }	
}