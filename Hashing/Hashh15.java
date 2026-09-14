import java.util.*;

public class Hashh15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
          a[i] = sc.nextInt();

        TreeMap<Integer, Integer> hm = new TreeMap<>();
        for (int x : a)
          hm.put(x, hm.getOrDefault(x, 0) + 1);

        int min = Collections.min(hm.values());
        System.out.println("Elements with min frequency:");
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == min) {
                System.out.println(entry.getKey());
            }
        }
    }
}