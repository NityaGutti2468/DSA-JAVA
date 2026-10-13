import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collections;

public class Set4 { 
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
       arr[i] = sc.nextInt();
    }
     TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
     for (int num : arr) {
       set.add(num);
     }
     for(int x:set){
      System.out.println(x);
     }
     sc.close();
    }
}