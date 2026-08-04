import java.util.*;

public class NestedArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows (n): ");
        int n = sc.nextInt();
        System.out.print("Enter columns (m): ");
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        System.out.println("Enter " + n + " rows of " + m + " integers:");
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(sc.nextInt());
            }
            al.add(row);
        }
        System.out.println("\nNested ArrayList:");
        for (ArrayList<Integer> row : al) {
            System.out.println(row);
        }
        Collections.sort(al, (x, y) -> x.get(1) - y.get(1));

        System.out.println("\nAfter sorting by column 2:");
        for (ArrayList<Integer> row : al) {
            System.out.println(row);
        }

        sc.close();
    }
}