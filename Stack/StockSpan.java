import java.util.*;
class StockSpan {
static ArrayList<Integer> Stockspan(int a[], int n) {
ArrayList<Integer> span=new ArrayList<>();
Stack<Integer> st=new Stack<>();
st.push(0);
span.add(1);
for(int i=1;i<n;i++) {
while(!st.isEmpty() && a[st.peek()]<=a[i]) {
st.pop();
}
int val=st.isEmpty()?i+1:i-st.peek();
span.add(val);
st.push(i);
}
return span;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of days:");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter stock prices:");
for(int i=0;i<n;i++) {
a[i]=sc.nextInt();
}
ArrayList<Integer> res=Stockspan(a,n);
System.out.println("Stock Span values: "+res);
}
}