import java.util.Scanner;
import java.util.Arrays;
public class TwoSum7 {
static int[] isTwoSum(int a[], int n, int target) {
Arrays.sort(a);
for (int i=0; i<n; i++) {
int p = binarySearch(a, n, target - a[i]);
if (p!= -1 && p != i) 
return new int[]{a[i], a[p]};
}
return new int[]{-1,-1};
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
int n = sc.nextInt();
int[] a = new int[n];
for (int i = 0; i < n; i++) {
a[i] = sc.nextInt();
}
System.out.print("Enter target sum: ");
int target = sc.nextInt();
int[] result = isTwoSum(a, n, target);
System.out.println(result[0] != -1 ? Arrays.toString(result) : "-1");
sc.close();
}
}