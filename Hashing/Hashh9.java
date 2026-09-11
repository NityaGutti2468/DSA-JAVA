import java.util.*;
public class Hashh9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
        }
        int c = 0;
        for (int val : hm.values()) {
            if (val > c) {
                c = val;
            }
        }
        System.out.println("Elements with max frequency:");
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == c) {
                System.out.println(entry.getKey());
            }
        }
    }
}