import java.util.Scanner;
import java.util.Arrays;
public class TwoSum11 {
static int[] isTwoSum(int a[], int n, int target) {
int[][] arr = new int[n][2];
for (int i = 0; i < n; i++) {
arr[i][0] = a[i];
arr[i][1] = i;
}
Arrays.sort(arr, (x, y) -> Integer.compare(x[0], y[0]));
for (int i = 0; i < n; i++) {
int p = binarySearch(arr, n, target - arr[i][0], i);
if (p != -1)
return new int[]{arr[i][1], arr[p][1]};
}
return new int[]{-1, -1};
}

static int binarySearch(int[][] arr, int n, int x, int skip) {
int l = 0, r = n - 1;
while (l <= r) {
int m = (l + r) / 2;
if (arr[m][0] == x) {
if (m != skip) return m;
else if (m + 1 < n && arr[m + 1][0] == x) return m + 1;
else if (m - 1 >= 0 && arr[m - 1][0] == x) return m - 1;
else return -1;
} else if (x < arr[m][0]) {
r = m - 1;
} else {
l = m + 1;
}
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