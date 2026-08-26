import java.util.*;
class Node{
int data;
Node left,right;
Node(int d){
data=d;
left=right=null;
}
}
public class BST47{
Node root;
Node insert(Node root,int data){
if(root==null) return new Node(data);
if(data<root.data) root.left=insert(root.left,data);
else root.right=insert(root.right,data);
return root;
}
static int height(Node root){
if(root==null) return 0;
Queue<Node> q=new LinkedList<>();
q.add(root);
int h=0;
while(!q.isEmpty()){
int size=q.size();
for(int i=0;i<size;i++){
Node curr=q.poll();
if(curr.left!=null) q.add(curr.left);
if(curr.right!=null) q.add(curr.right);
}
h++;
}
return h;
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
BST47 tree=new BST47();
System.out.println("Enter number of nodes:");
int n=sc.nextInt();
for(int i=0;i<n;i++){
int val=sc.nextInt();
tree.root=tree.insert(tree.root,val);
}
System.out.println("Height (iterative): "+height(tree.root));
sc.close();
}
}