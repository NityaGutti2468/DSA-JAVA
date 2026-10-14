import java.util.HashSet;
import java.util.Scanner;

public class Set5 {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter size of array: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter " + n + " elements:");
for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
}
HashSet<Integer> set = new HashSet<>();
for (int num : arr) {
   set.add(num);
}
System.out.print("Enter element :");
int x = sc.nextInt();
if(set.contains(x)){
  System.out.println(x+" is already existed");
}
else {
    set.add(x);
    System.out.println(x+" is inserted");
 }
   sc.close();
    }
}