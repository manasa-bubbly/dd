import java.util.ArrayList;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class Solution {
    public static void getInOrder(TreeNode root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInOrder(root.left, inorder);
        inorder.add(root.val);
        getInOrder(root.right, inorder);
    }

    public static TreeNode CreateBST(ArrayList<Integer> inorder, int left, int right) {
        if (left > right) return null;
        int m = (right + left) / 2;
        TreeNode root = new TreeNode(inorder.get(m));
        root.left = CreateBST(inorder, left, m - 1);
        root.right = CreateBST(inorder, m + 1, right);
        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        getInOrder(root, inorder);
        return CreateBST(inorder, 0, inorder.size() - 1);
    }
    public static void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public static TreeNode insertBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) {
            root.left = insertBST(root.left, val);
        } else {
            root.right = insertBST(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        TreeNode root = null;

        System.out.println("Enter " + n + " node values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insertBST(root, val);
        }

        System.out.print("Original tree inorder: ");
        printInOrder(root);
        System.out.println();

        Solution solution = new Solution();
        TreeNode balancedRoot = solution.balanceBST(root);

        System.out.print("Balanced tree inorder: ");
        printInOrder(balancedRoot);
        System.out.println();

        sc.close();
    }
}
