import java.util.*;
class SortStack {
static Stack<Integer> SortStack(Stack<Integer> st) {
Stack<Integer> temp=new Stack<>();
while(!st.isEmpty()) {
int x=st.pop();
while(!temp.isEmpty() && temp.peek()>x) {
st.push(temp.pop());
}
temp.push(x);
}
return temp;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Stack<Integer> st=new Stack<>();
System.out.println("Enter number of elements:");
int n=sc.nextInt();
System.out.println("Enter elements:");
for(int i=0;i<n;i++) {
st.push(sc.nextInt());
}
System.out.println("Original Stack: "+st);
st=SortStack(st);
System.out.println("Sorted Stack: "+st);
}
}