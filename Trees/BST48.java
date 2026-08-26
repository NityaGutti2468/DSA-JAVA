import java.util.*;
class Node{
int data;
Node left,right;
Node(int d){
data=d;
left=right=null;
}
}
public class BST48{
Node root;
Node insert(Node root,int data){
if(root==null) 
return new Node(data);
if(data<root.data) 
root.left=insert(root.left,data);
else 
root.right=insert(root.right,data);
return root;
}
static ArrayList<Integer> nodesBetweenLevels(Node root,int L1,int L2){
ArrayList<Integer> res=new ArrayList<>();
if(root==null) 
return res;
Queue<Node> q=new LinkedList<>();
q.add(root);
int level=0;
boolean l1=false;
while(!q.isEmpty()){
int size=q.size();
ArrayList<Integer> temp=new ArrayList<>();
for(int i=0;i<size;i++){
Node curr=q.poll();
if(level>=L1 && (L2==-1 || level<=L2)) 
temp.add(curr.data);
if(curr.left!=null) 
q.add(curr.left);
if(curr.right!=null) 
q.add(curr.right);
}
if(level==L1) l1=true;
if(level>=L1 && (L2==-1 || level<=L2)) res.addAll(temp);
level++;
}
if(!l1) return new ArrayList<>();
return res;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
BST48 tree=new BST48();
System.out.println("Enter number of nodes:");
int n=sc.nextInt();
for(int i=0;i<n;i++){
int val=sc.nextInt();
tree.root=tree.insert(tree.root,val);
}
System.out.println("Enter L1 and L2:");
int L1=sc.nextInt();
int L2=sc.nextInt();
System.out.println(nodesBetweenLevels(tree.root,L1,L2));
sc.close();
}
}