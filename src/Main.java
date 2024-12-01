import trees.prcaticeTrees.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.prettyPrintTree(tree.root,0);
    }
}