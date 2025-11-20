package Chapter_8_Binary_Tree;

public class TestTree {
    public static void main(String[] args) {
        Tree theTree = new Tree();
        theTree.insert(50);
        theTree.insert(25);
        theTree.insert(15);
        theTree.insert(35);
        theTree.insert(5);
        theTree.insert(20);
        theTree.insert(30);
        theTree.insert(40);
        theTree.inOrder(theTree.getRoot());
        int x = theTree.findMin();
        int y = theTree.findMax();
        System.out.println("Minimum " + x);
        System.out.println("Maximum " + y);
        theTree.delete(25);
        theTree.inOrder(theTree.getRoot());


    }///end TestTree
}///end class TestTree
