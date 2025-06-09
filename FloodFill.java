import java.util.*;

public class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor)
            dfschange(image, sr, sc, newColor, color);
        return image;
    }

    public void dfschange(int[][] image, int sr, int sc, int newColor, int original) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != original)
            return;
        image[sr][sc] = newColor;
        dfschange(image, sr + 1, sc, newColor, original);
        dfschange(image, sr - 1, sc, newColor, original);
        dfschange(image, sr, sc + 1, newColor, original);
        dfschange(image, sr, sc - 1, newColor, original);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.println("Enter number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] image = new int[rows][cols];
        System.out.println("Enter the image matrix (row by row):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                image[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter starting row (sr), starting column (sc), and new color:");
        int sr = sc.nextInt();
        int scCol = sc.nextInt();  // renamed to scCol to avoid conflict with Scanner 'sc'
        int newColor = sc.nextInt();

        int[][] result = sol.floodFill(image, sr, scCol, newColor);

        System.out.println("Flood filled image:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
