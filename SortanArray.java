import java.util.*;

public class Solution {
    public int[] sortArray(int[] nums) {
       helper(nums, 0, nums.length - 1);
       return nums;
    }

    public void helper(int[] nums, int start, int end) {
        if (start >= end) return;

        int pivotIndex = groupByPivot(nums, start, end);
        helper(nums, start, pivotIndex - 1);
        helper(nums, pivotIndex + 1, end);
    }

    public int groupByPivot(int[] nums, int start, int end) {
        int index = start + new Random().nextInt(end - start + 1);
        int pivot = nums[index];
        swap(nums, index, end);

        int ptr = start;
        for (int i = start; i < end; i++) {
            if (nums[i] < pivot) {
                swap(nums, i, ptr++);
            }
        }
        swap(nums, ptr, end);
        return ptr;
    }

    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int[] sorted = sol.sortArray(nums);

        System.out.println("Sorted array:");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
