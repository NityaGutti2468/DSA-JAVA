import java.util.*;

public class Hashh6 {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int a[] = new int[n];
     for (int i = 0; i < n; i++) {
       a[i] = sc.nextInt();
     }
     LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
    for (int i = 0; i < n; i++) {
          if (hm.containsKey(a[i]))
              hm.put(a[i], hm.get(a[i]) + 1);
            else
              hm.put(a[i], 1);
     }
      Set<Integer> s1 = hm.keySet();
      System.out.println("Element ---- Frequency");
      for (Integer x : s1) {
      System.out.println(x + "    " + hm.get(x));
        }
    }
}