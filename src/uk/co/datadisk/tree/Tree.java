package uk.co.datadisk.tree;

public class Tree {

    private TreeNode root;

    public void insert(int value){
        if ( root == null){
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
            System.out.println();
        }
    }

    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
            System.out.println();
        }
    }

    public void traversePostOrder() {
        if (root != null) {
            root.traversePostOrder();
            System.out.println();
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }

        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value) {
        if( subTreeRoot == null) {
            return subTreeRoot;
        }

        if(value < subTreeRoot.getData()) {
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        } else if (value > subTreeRoot.getData()) {
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        } else  {

            // Cases 1 (left only) and 2 (one child either left or right only): node to delete has 0 or 1 child(ren)
            if ( subTreeRoot.getLeftChild() == null) {
                return subTreeRoot.getRightChild();
            } else if (subTreeRoot.getRightChild() == null) {
                return subTreeRoot.getLeftChild();
            }

            // Case 3: node has two children

            // Replace the value in the subTreeRoot node with the smallest value
            // from the right subtree
            subTreeRoot.setData(subTreeRoot.getRightChild().min());

            // Delete the node that has the smallest value in the right subtree
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
        }

        return subTreeRoot;
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }



}
