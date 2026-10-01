import java.util.Scanner;

public class Fibo2 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
 fibn(n);
 }
 static void fibn(int n){
   if(n==1)
     System.out.println(0);
   if(n==2)
     System.out.println(0+" "+1);
    else{
   int a=0,b=1,c;
   System.out.print(a+" "+b);
  for(int i=3;i<=n;i++)
   {
    c=a+b;
    System.out.print(" "+c);
     a=b;
     b=c;
} } } }