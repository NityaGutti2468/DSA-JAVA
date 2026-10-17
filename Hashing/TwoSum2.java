import java.util.Scanner;
import java.util.Arrays;
public class TwoSum2 {
static boolean isTwoSum(int arr[],int n, int target){
int i=0,j=n-1,sum=0;
Arrays.sort(arr);
while(i<j){
sum=arr[i]+arr[j];
if(sum == target)
return true;
else if(sum < target)
i++;
else
j--;
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
