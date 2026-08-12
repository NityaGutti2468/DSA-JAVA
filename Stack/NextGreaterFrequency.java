import java.util.*;
class NextGreaterFrequency {
static ArrayList<Integer> NextGreatFreq(int a[]) {
ArrayList<Integer> res=new ArrayList<>();
int n=a.length;
int b[]=new int[n];
HashMap<Integer,Integer> freq=new HashMap<>();
for(int x:a) {
freq.put(x,freq.getOrDefault(x,0)+1);
}
Stack<Integer> st=new Stack<>();
for(int i=n-1;i>=0;i--) {
while(!st.isEmpty() && freq.get(st.peek())<=freq.get(a[i])) {
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
System.out.println("Enter no. of elements:");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter elements:");
for(int i=0;i<n;i++) {
a[i]=sc.nextInt();
}
ArrayList<Integer> ans=NextGreatFreq(a);
System.out.println("Next Greater Frequency Elements: "+ans);
}
}