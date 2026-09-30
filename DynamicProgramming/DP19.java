import java.util.*;
public class DP19 {
public static int maxSubArraySum(int[] arr) {
int maxx = arr[0];  
int m1 = arr[0];    
for (int i = 1; i < arr.length; i++) {
maxx = Math.max(arr[i], maxx + arr[i]);
m1 = Math.max(m1, maxx);
}
return m1;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
System.out.println("Maximum Subarray Sum: " + maxSubArraySum(arr));
}
}
