package trees.prcaticeTrees;

import java.util.Scanner;

public class BinaryTree {
    public Node root = null;
    Node currentNode = null;
    public void insertNode(Scanner scanner,Node currentNode){
        if(root == null){
            System.out.println("Enter the data :");
            int newNodeData = scanner.nextInt();
            currentNode = root = new Node(newNodeData);
        }
        if(root !=null){
            System.out.println("Do you want to insert it on left of"+ currentNode.data+"?");
            boolean isLeft = scanner.next().compareToIgnoreCase("y")==0;
            if (isLeft) {
                System.out.println("Enter Left data :");
                int newNodeData = scanner.nextInt();
                currentNode.left = new Node(newNodeData);
                insertNode(scanner,currentNode.left);
            }
            System.out.println("Do you want to insert it on right of"+ currentNode.data+"?");
            boolean isRight = scanner.next().compareToIgnoreCase("y")==0;;
            if(isRight){
                System.out.println("Enter Right data :");
                int newNodeData = scanner.nextInt();
                currentNode.right = new Node(newNodeData);
                insertNode(scanner,currentNode.right);
            }
        }
    }
    public void printTree(Node node){
        if(node != null){
            System.out.print(node.data+"-->");
            printTree(node.left);
            printTree(node.right);
        }
    }
    public void prettyPrintTree(Node node,int lvl){
        if(node == null){
           return;
        }
        prettyPrintTree(node.right,lvl+1);
        if(lvl !=0){
            for(int i=0;i<lvl-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.data);
        }
        else {
            System.out.println(node.data);
        }
        prettyPrintTree(node.left,lvl+1);
    }
    public void insertBT(Node node,int data){
        if(root == null) {
            root = currentNode = new Node(data);
        }
        else if (node == null){
            node = new Node(data);
        }
        else {

            if(currentNode.data < data){
                insertBT(currentNode.left ,data);
            }
            else{
                insertBT(currentNode.right,data);
            }
        }
    }
}
