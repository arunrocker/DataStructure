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
    private void insert(Node node,int data){
            if(data < node.data){
                if(node.left ==null){
                    node.left = new Node(data);
                }
                else {
                    insert(node.left, data);
                }
            }
            else{
                if(node.right ==null){
                    node.right = new Node(data);
                }
                else {
                    insert(node.right, data);
                }
            }
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
