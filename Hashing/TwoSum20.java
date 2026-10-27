import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;
public class TwoSum20 {
static int[] isTwoSum(int a[],int n, int target){
HashSet<Integer> hs=new HashSet<>();
for(int i=0;i<n;i++){
int c=target-a[i];
if(hs.contains(c))
return new int[]{a[i], c};
hs.add(a[i]);
}
return new int[]{-1,-1};
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