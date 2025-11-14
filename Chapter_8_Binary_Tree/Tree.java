package Chapter_8_Binary_Tree;

public class Tree {
    private Node root;
    public Tree() {
        root = null;
    }///end constructor Tree

    public void insert(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
        }///end if
        else{         ///not root
            Node current = root;
            Node parent = null;
            while(true){
                parent = current;
                if( value < current.getNumber()){
                    current = current.getLeftChild();
                    if(current == null){
                        parent.setLeftChild(newNode);
                        return;
                    }///end inside if
                }///end if
            else{
                current = current.getRightChild();
                if(current == null){
                    parent.setRightChild(newNode);
                    return;
                }///end inter if
                }///end else
            }///end while
        }///end else not root
    }///end insert()

    public Node find(int key){
        Node current = root;
        while ( current.getNumber() != key){
            if (key < current.getNumber()){
                current = current.getLeftChild();
            }///end if
            else{
                current = current.getRightChild();
            }///end else
            if( current == null){
                return null;
            }///end if
        }///end while
        return current;
    }///end find


     /*Java code for Inorder Traversal: used to create a sorted list of Data in binary tree*/
            public Node getRoot(){
                return  root;
            }///end getRoot()
            public void inOrder(Node root){
                if(root != null){
                    inOrder(root.getLeftChild());
                    root.displayNode();
                    inOrder(root.getRightChild());
                }///end if
            }///end inOrder()

    /* Finding the minimum Value: goes left of to children until there are no more children */
             public int findMin(){
                 Node current, last = null;
                 current = root;
                 while (current != null){
                     last = current;
                     current = current.getLeftChild();
                 }///end while
                 return last.getNumber();
             }///end findMin()

    /* Finding the Maximum Value*/
            public int findMax(){
                Node current, last = null;
                current = root;
                while (current != null){
                    last = current;
                    current = current.getRightChild();
                }///end while
                return last.getNumber();
            }///end findMax()
}///end class Tree
