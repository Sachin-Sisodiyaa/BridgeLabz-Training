package com.day_3.hackerrank;
import java.util.*;
import java.io.*;

public class InOrderTraversal {
    static class InOrderNode {
        InOrderNode left;
        InOrderNode right;
        int data;

        InOrderNode(int data) {
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

    public static void inOrder(InOrderNode root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

	public static InOrderNode insert(InOrderNode root, int data) {
        if(root == null) {
            return new InOrderNode(data);
        } else {
            InOrderNode cur;
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
        InOrderNode root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        inOrder(root);
    }	
}
