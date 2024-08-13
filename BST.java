import java.util.*;

public class BST {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (root.data > value) {
            root.left = insert(root.left, value);
        }

        if (root.data < value) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else // root.data==val
        {
            // case-1 : val is leaf Node
            if (root.right == null && root.left == null)
                return null;

            // case-2 : value have the one child
            if (root.right == null)
                return root.left;
            else if (root.left == null)
                return root.right;

            // case-3 : root have the two child at that time you have to cheack the inorder
            // successor
            Node IS = inordersuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inordersuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void printinrange(Node root, int x, int y) {
        if (root == null)
            return;
        if (root.data >= x && root.data <= y) {
            printinrange(root.left, x, y);
            System.out.print(root.data + " ");
            printinrange(root.right, x, y);
        } else if (root.data <= x) {
            printinrange(root.right, x, y);
        } else
            printinrange(root.left, x, y);
    }

    public static void printpath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
    }

    public static void root2leaf(Node root, ArrayList<Integer> path) {
        if (root == null)
            return;

        path.add(root.data);
        if (root.right == null && root.left == null)
            printpath(path);
        else {
            root2leaf(root.left, path);
            root2leaf(root.right, path);
        }
        path.remove(path.size() - 1);

    }

    public static void main(String[] args) {
        int value[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        inorder(root);
        System.out.println();
        // System.out.println(search(root, 1));

        // delete(root, 10);
        // inorder(root);

        // printinrange(root, 3, 12);

        root2leaf(root, new ArrayList<>());
    }
}
