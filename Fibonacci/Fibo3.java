import java.util.ArrayList;
import java.util.Scanner;

public class Fibo3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
ArrayList<Integer> res = fibn(n);
for(int x:res){
System.out.print(x+" ");
}
}
static ArrayList<Integer> fibn(int n){
ArrayList<Integer> res = new ArrayList<>();
if(n==1)
res.add(0);
if(n==2)
{
res.add(0);
res.add(1);
}
else{
int a=0,b=1,c;
res.add(0);
res.add(1);
for(int i=3;i<=n;i++)
{
c=a+b;
res.add(c);
a=b;
b=c;
}
}
return res;
    }
}