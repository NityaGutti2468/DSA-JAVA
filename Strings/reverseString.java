import java.util.Scanner;
class reverseString {
public static String reverseString(String s) {
char[] c = s.toCharArray(); 
int i=0, j=c.length-1;
while (i < j) {
char temp = c[i];
c[i] = c[j];
c[j] = temp;
i++;
j--;
}
return new String(c);
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
System.out.println(reverseString(input));        
sc.close();
}
}