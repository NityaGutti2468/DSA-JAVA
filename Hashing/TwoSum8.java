import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;
public class TwoSum8 {
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


6. Given array of sorted integers and target, verify whether pair exists with sum equal to target or not-4 methods
Using Brute force 
Using sorting and two pointer
Using sorting and binary search 
Using hashing
7.Given array of sorted integers and target, find and return elements of pair  sum equal to target or not-4 methods
Using Brute force 
Using sorting and two pointer
Using sorting and binary search 
Using hashing
8. Given array of sorted integers and target, find and return indices of elements of pair  sum equal to target or not-4 methods
Using Brute force 
Using sorting and two pointer
Using sorting and binary search 
Using hashing