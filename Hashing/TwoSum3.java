import java.util.Scanner;
import java.util.Arrays;
public class TwoSum3 {
static boolean isTwoSum(int arr[], int n, int target) {
Arrays.sort(arr);
for (int i=0; i<n; i++) {
int p = binarySearch(arr, n, target - arr[i]);
if (p!= -1 && p != i) 
return true;
}
return false;
}
static int binarySearch(int a[], int n, int x) {
int l = 0, r = n - 1;
while (l <= r) {
int m = (l + r) / 2;
if (x == a[m])
return m;
else if (x < a[m])
r = m - 1;
else
l = m + 1;
}
return -1;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = sc.nextInt();
int[] a = new int[n];
System.out.println("Enter array elements:");
for (int i = 0; i < n; i++) {
a[i] = sc.nextInt();
}
System.out.print("Enter target sum: ");
int target = sc.nextInt();
System.out.println(isTwoSum(a, n, target) ? "Pair exists." : "No such pair.");
sc.close();
}
}