import java.util.HashMap;
import java.util.Scanner;

public class Set8 {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter size of array: ");
 int n = sc.nextInt();
 int[] arr = new int[n];
 System.out.println("Enter " + n + " elements:");
 for (int i = 0; i < n; i++) {
   arr[i] = sc.nextInt();
 }
  HashMap<Integer, Integer> hm = new HashMap<>();
    for (int num : arr) {
   hm.put(num,hm.getOrDefault(num,0)+1);
      }
   System.out.print("Enter element : ");
   int x = sc.nextInt();
   if (hm.containsKey(x)) {
     System.out.println(x + " with frequency :"+hm.get(x));
   } else {
       hm.put(x, 1);
       System.out.println(x + " with frequency :"+hm.get(x));
    }
     sc.close();
    }
}