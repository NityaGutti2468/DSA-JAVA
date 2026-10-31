import java.util.Scanner;
import java.util.Arrays;
public class TwoSum21 {
static int[] isTwoSum(int a[],int n, int target){
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if((a[i]+a[j])==target)
return new int[]{i,j};
}
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
