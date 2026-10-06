import java.util.Scanner;
public class FiboLastDigit {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int res = fibn(n);
int Lastdigit = res %10;
System.out.print("lastDigit :"+Lastdigit);
}
static int fibn(int n){
if(n==0)    
return 0;
if(n==1)    
return 1;
int a=0,b=1,c=0;
for(int i=2;i<=n;i++){
c=a+b;
a=b;
b=c;
}
return c;
}
}