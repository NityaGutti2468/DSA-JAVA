import java.util.Scanner;
public class FiboLastDigit2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int res= LastDigitFibN(n);
System.out.print("lastTwoDigits :"+res);
}
static int LastDigitFibN(int n){
int f[]= new int[60];
f[0]=0;
f[1]=1;
for( int i= 2 ; i < 60 ; i++){
f[i] = (f[i-1]+f[i-2]) %100;
}
int N=n%60;
return f[N];
}
}