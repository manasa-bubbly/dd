import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the sorted array:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted integers separated by space:");

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new Solution();
        TreeNode root = sol.sortedArrayToBST(nums);

        List<Object> output = sol.levelOrderList(root);
        System.out.println("Level order traversal of constructed BST:");
        System.out.println(output);

        scanner.close();
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int st, int end){
        if(st > end){
            return null;
        }
        int mid = (st + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, st, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }

    public void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public List<Object> levelOrderList(TreeNode root) {
        List<Object> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current != null) {
                result.add(current.val);
                queue.offer(current.left);
                queue.offer(current.right);
            } else {
                result.add(null);
            }
        }

        // Remove trailing nulls to clean up the output list
        int i = result.size() - 1;
        while (i >= 0 && result.get(i) == null) {
            result.remove(i);
            i--;
        }

        return result;
    }
}
