import java.util.*;
class MatchingBracket {
static void test(String exp,int index) {
if(index<0 || index>=exp.length() || exp.charAt(index)!='[') {
System.out.println("Invalid ");
return;
}
int count=0;
for(int i=index;i<exp.length();i++) {
if(exp.charAt(i)=='[') count++;
else if(exp.charAt(i)==']') count--;
if(count==0) {
System.out.println("Closing bracket position "+i);
return;
}
}
System.out.println("No matching closing bracket found");
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter exp:");
String exp=sc.nextLine();
System.out.println("Enter index of [ :");
int idx=sc.nextInt();
test(exp,idx);
}
}