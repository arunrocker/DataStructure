package trees;

import java.util.Scanner;

public class BinaryTree {
    Node root;
    String result;
    public BinaryTree(){

    }
    public void insert(int data){
        Node node = null;
        if(root ==null){
            node = root = new Node(data);
        }
        insertData(node);
        System.out.println(result);
    }
    public void insertData(Node node){
        int data;
        System.out.println("Do you want to insert on the left?");
        Scanner sc = new Scanner(System.in);
        if(sc.nextBoolean()) {
            System.out.println("Enter the value of left "+ node.data);
            data = sc.nextInt();
            node.left = new Node(data); // 11
            insertData(node.left);
        }
        System.out.println("Do you want to insert on the right?");
        if(sc.nextBoolean()) {
            System.out.println("Enter the value of right " + node.data);
            data = sc.nextInt();
            node.right = new Node(data);
            insertData(node.right);
        }
        this.result  = this.result+node.data + "->";
    }
}
