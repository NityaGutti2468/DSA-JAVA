import java.util.Scanner;
public class TernarySearchIndex{
public static int ternarySearch(int[] arr,int x){
int l=0,h=arr.length-1;
while(l<=h){
int mid1=l+(h-l)/3;
int mid2=h-(h-l)/3;
if(arr[mid1]==x)
return mid1;
if(arr[mid2]==x)
return mid2;
if(x<arr[mid1])
h=mid1-1;
else if(x>arr[mid2])
l=mid2+1;
else{
l=mid1+1;
h=mid2-1;
}
}
return -1; 
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
System.out.println(ternarySearch(arr,x));
sc.close();
}
}
