package com.day_3.hackerrank;
import java.util.*;
import java.io.*;

public class PostOrderTraversal {
    static class PostOrderNode {
        PostOrderNode left;
        PostOrderNode right;
        int data;

        PostOrderNode(int data) {
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

    public static void postOrder(PostOrderNode root) {
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

	public static PostOrderNode insert(PostOrderNode root, int data) {
        if(root == null) {
            return new PostOrderNode(data);
        } else {
            PostOrderNode cur;
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
        PostOrderNode root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        postOrder(root);
    }	
}
