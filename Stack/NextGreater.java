import java.util.*;
class NextGreater {
static ArrayList<Integer> NextGreat(int a[]) {
ArrayList<Integer> res=new ArrayList<>();
Stack<Integer> st=new Stack<>();
int n=a.length;
int b[]=new int[n];
for(int i=n-1;i>=0;i--) {
while(!st.isEmpty() && st.peek()<=a[i]) {
st.pop();
}
b[i]=st.isEmpty()?-1:st.peek();
st.push(a[i]);
}
for(int i=0;i<n;i++) {
res.add(b[i]);
}
return res;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++) {
a[i]=sc.nextInt();
}
ArrayList<Integer> ans=NextGreat(a);
System.out.println("Next Greater Elements: "+ans);
}
}