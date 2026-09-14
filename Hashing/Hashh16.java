import java.util.*;

public class Hashh16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
          a[i] = sc.nextInt();

        TreeMap<Integer, Integer> hm = new TreeMap<>(Collections.reverseOrder());
        for (int x : a) 
           hm.put(x, hm.getOrDefault(x, 0) + 1);
        Set<Integer> s1 = hm.keySet();
        int min = Collections.min(hm.values());

        System.out.println("Elements with min frequency:");
        for (Integer x : s1) {
            if (hm.get(x) == min) {
                System.out.println(x);
            }
        }
    }
}