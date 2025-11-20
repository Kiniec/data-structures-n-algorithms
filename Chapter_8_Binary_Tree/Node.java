package Chapter_8_Binary_Tree;

public class Node {
    private int number;
    private Node leftChild;
    private Node rightChild;
    public Node(int x) {
        number = x;
    }///end Node constructor

    public void setNumber(int x) {
        number = x;
    }///end setNumber()

    public int getNumber() {
        return number;
    }///end getNumber()

    public void displayNode() {
        System.out.print(number);
    }///end displayNode()

    public Node getLeftChild() {
        return leftChild;
    }///end getLeftChild

    public Node  getRightChild() {
        return rightChild;
    }///end getRigthChild

    public void setLeftChild(Node x) {
        leftChild = x;
    }///end setLeftChild

    public void setRightChild(Node x) {
        rightChild = x;
    }///end setRightChild


}///end class Node
