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
        while ( current.getNumber() != key){ /// checking root
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

    /*Deleting a node*/
    public boolean delete (int key){
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while(current.getNumber() != key){
            parent = current;
            if( key < current.getNumber()){
                current = current.getLeftChild();
            }///end if
            else{
                isLeftChild = false;
                current = current.getRightChild();
            }
            if (current == null){
                return false;
            }///end if
        }///end while
        if (current.getLeftChild() == null && current.getRightChild() == null ){
            if (current == root){
                root = null;
            }///end inter if
            else if (isLeftChild){
                parent.setLeftChild(null);
            }/// end else if
            else{
                parent.setRightChild(null);
            }///end else
        }///end if

        else if( current.getRightChild() == null  ){
            if (current == root){
                root = current.getLeftChild();
            }///end if
            else if (isLeftChild){
                parent.setLeftChild(current.getLeftChild());
            }///end else if
            else{
                parent.setRightChild(current.getRightChild());
            }///end else
        }///end else if

        else if( current.getLeftChild() == null){
            if( current == null){
                root = current.getRightChild();
            }///end if
            else if (isLeftChild){
                parent.setLeftChild(current.getRightChild());
            }///end else if
            else{
                parent.setRightChild(current.getRightChild());
            }///end else
        }///end else if
        else{
            Node successor = getSuccessor(current);
                if(current == root){
                    root = successor;
                }///end if
                else if (isLeftChild){
                    parent.setLeftChild(successor);
                }///end else if
                else {
                    parent.setRightChild(successor);
                }///end else
                successor.setLeftChild(current.getLeftChild());
        }///end else
        return true;
    } ///end delete()

    /* Get the parent node above child*/
    private Node getSuccessor(Node x){
        Node successorParent = x;
        Node successor = x;
        Node current = x;
        while (current != null){
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();
        }///end while
        if(successor != x.getRightChild()){
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(x.getRightChild());
        }///end if
        return successor ;
    }///end getSuccessor()



}///end class Tree
