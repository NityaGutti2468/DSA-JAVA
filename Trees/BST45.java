import java.util.*;
class Node{
int data;
Node left,right;
Node(int d){
data=d;
left=right=null;
}
}
public class BST45{
static ArrayList<Integer> NodeAtl1(Node root,int l){
ArrayList<Integer> res=new ArrayList<>();
if(root==null) return res;
Queue<Node> q=new LinkedList<>();
q.add(root);
int l1=0;
while(!q.isEmpty()){
int size=q.size();
ArrayList<Integer> t=new ArrayList<>();
for(int i=0;i<size;i++){
Node c=q.poll();
if(l1==l) t.add(c.data);
if(c.left!=null) q.add(c.left);
if(c.right!=null) q.add(c.right);
}
if(l1==l){
Collections.reverse(t);
return t;
}
l1++;
}
return res;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of nodes:");
int n=sc.nextInt();
Node[] nodes=new Node[n];
for(int i=0;i<n;i++){
nodes[i]=new Node(sc.nextInt());
}
for(int i=0;i<n;i++){
int leftIndex=2*i+1;
int rightIndex=2*i+2;
if(leftIndex<n) nodes[i].left=nodes[leftIndex];
if(rightIndex<n) nodes[i].right=nodes[rightIndex];
}
Node root=nodes[0];
System.out.println("Enter level:");
int l1=sc.nextInt();
System.out.println(NodeAtl1(root,l1));
sc.close();
}
}