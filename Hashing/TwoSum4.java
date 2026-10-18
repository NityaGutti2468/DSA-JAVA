import java.util.Scanner;
import java.util.HashSet;
public class TwoSum4 {
static boolean isTwoSum(int arr[],int n, int target){
HashSet<Integer> hs=new HashSet<>();
for(int i=0;i<n;i++){
int c=target-arr[i];
if(hs.contains(c))
return true;
hs.add(arr[i]);
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
