package uk.co.datadisk.tree;

public class BinarySearchTree {

    public static void main(String[] args) {

        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);
        System.out.println("Tree created");

        System.out.print("IN Order: ");
        intTree.traverseInOrder();

        System.out.print("PRE Order: ");
        intTree.traversePreOrder();

        System.out.print("POST Order: ");
        intTree.traversePostOrder();

        System.out.println(intTree.get(27));
        System.out.println(intTree.get(17));
        System.out.println(intTree.get(8888));

        System.out.println();
        System.out.println("MIN value = " + intTree.min());
        System.out.println("MAX value = " + intTree.max());
        System.out.println();

        intTree.delete(15);
        intTree.traverseInOrder();
        System.out.println();

        intTree.delete(17);
        intTree.traverseInOrder();
        System.out.println();

        intTree.delete(25);
        intTree.traverseInOrder();
        System.out.println();

        intTree.delete(8888);
        intTree.traverseInOrder();
        System.out.println();
    }
}