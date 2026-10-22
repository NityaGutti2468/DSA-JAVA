import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class TwoSum12 {
static int[] isTwoSum(int a[],int n, int target){
Map<Integer, Integer> map = new HashMap<>();
for (int i = 0; i < a.length; i++) {
int p = target - a[i];
if (map.containsKey(p)) {
return new int[]{map.get(p), i};
}
map.put(a[i], i);
}
return new int[]{-1, -1};
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
