import java.util.Scanner;
public class TwoSum13 {
static boolean isTwoSum(int a[],int n, int target){
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if((a[i]+a[j])==target)
return true;
}
}
return false;
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
System.out.println(isTwoSum(a, n, target) ? "Pair exists." : "No such pair.");
sc.close();
}
}
