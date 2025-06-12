public class KnapSackRecursive {
    public static int KnapSack(int[] Weight, int[] profit, int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (Weight[n - 1] > w) {
            return KnapSack(Weight, profit, w, n - 1);
        } else {
            int include = profit[n - 1] + KnapSack(Weight, profit, w - Weight[n - 1], n - 1);
            int exclude = KnapSack(Weight, profit, w, n - 1);
            return Math.max(include, exclude);
        }
    }

    public static void main(String[] args) {
        int w1 = 4;
        int[] profit1 = {1, 2, 3};
        int[] Weight1 = {4, 5, 1};
        int n1 = profit1.length;

        int result = KnapSack(Weight1, profit1, w1, n1);
        System.out.println("Output for Testcase: " + result);
    }
}