import java.util.Scanner;
import java.util.Arrays;
public class TwoSum6 {
static int[] isTwoSum(int a[],int n, int target){
int i=0,j=n-1,sum=0;
Arrays.sort(a);
while(i<j){
sum=a[i]+a[j];
if(sum == target)
return new int[]{a[i],a[j]};
else if(sum < target)
i++;
else
j--;
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
