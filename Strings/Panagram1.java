import java.util.HashSet;
import java.util.Scanner;
public class Panagram1 {
public static boolean checkPanagram(String s){
s = s.toLowerCase();
HashSet<Character> set = new HashSet<>();
for(char c : s.toCharArray())
{
if(c>='a' && c<='z'){
set.add(c);
}
}
return set.size()==26;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
System.out.println(checkPanagram(s) ? "Panagram !" : "Not Panagram !");
sc.close();
}
}

- The quick brown fox jumps over the lazy dog
- 
