import java.util.*;

public class Hashh17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) 
          a[i] = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : a) 
          hm.put(x, hm.getOrDefault(x, 0) + 1);
        Set<Integer> s1 = hm.keySet();
        System.out.println("Unique Elements:");
        for (Integer x : s1) {
            if (hm.get(x) == 1) {
                System.out.println(x);
            }
        }
    }
}