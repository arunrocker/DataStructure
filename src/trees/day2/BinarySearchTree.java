package trees.day2;

public class BinarySearchTree {
    public Node root;

    public void insert(int data){
        if(root == null){
            root = new Node(data);
        }
        else {
            insert(root,data);
        }
    }
    private Node insert(Node node,int data){
        if(node == null){
            return new Node(data);
        }
            if(data < node.data){
               node.left = insert(node.left,data);
            }
            else{
                node.right = insert(node.right,data);
            }
            return node;
    }
    public void prettyPrintTree(Node node, int lvl){
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
}
