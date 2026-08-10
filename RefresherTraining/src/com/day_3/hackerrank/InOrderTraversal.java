package com.day_3;
import java.util.*;
import java.io.*;

class InOrderTraversal {
    InOrderTraversal left;
    InOrderTraversal right;
    int data;
    
    InOrderTraversal(int data) {
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

    public static void inOrder(InOrderTraversal root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

	public static InOrderTraversal insert(InOrderTraversal root, int data) {
        if(root == null) {
            return new InOrderTraversal(data);
        } else {
            InOrderTraversal cur;
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
        InOrderTraversal root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        inOrder(root);
    }	
}