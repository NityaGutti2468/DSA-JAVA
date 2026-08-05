import java.util.Scanner;
public class BinarySearchindex1{
public static int binarySearch(int[] arr,int l,int h,int x){
if(l>h)
return -1;
int m=(l+h)/2;
if(arr[m]==x)
return m;
else if(arr[m]<x)
return binarySearch(arr,m+1,h,x);
else
return binarySearch(arr,l,m-1,x);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of elements:");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter "+n+" sorted elements:");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.print("Enter element to search:");
int x=sc.nextInt();
System.out.println(binarySearch(arr,0,n-1,x));
sc.close();
}
}
