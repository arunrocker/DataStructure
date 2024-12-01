import trees.day2.BinarySearchTree;
import trees.prcaticeTrees.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.prettyPrintTree(tree.root,0);
        */
        BinarySearchTree search = new BinarySearchTree();
        search.insert(10);
        search.insert(5);
        search.insert(7);
        search.prettyPrintTree(search.root,0);
    }
}