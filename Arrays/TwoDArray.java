import java.util.*;

public class TwoDArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows (n): ");
        int n = sc.nextInt();
        System.out.print("Enter columns (m): ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter the elements :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

       Arrays.sort(arr ,(x,y) -> y[1]-x[1]);
        System.out.println("\nSorted array in Descending (by second column):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}