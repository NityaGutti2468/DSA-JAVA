import java.util.*;
class Node{
int data;
Node left,right;
Node(int data){
this.data=data;
left=right=null;
}
}
class BST39{
static Node insert(Node root,int key){
if(root==null) return new Node(key);
if(key<root.data) root.left=insert(root.left,key);
else if(key>root.data) root.right=insert(root.right,key);
return root;
}
static int findLargest(Node root){
if(root==null) throw new NoSuchElementException("BST is empty");
Node cur=root;
while(cur.right!=null) cur=cur.right;
return cur.data;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Node root=null;
System.out.println("Enter number of nodes:");
int n=sc.nextInt();
for(int i=0;i<n;i++) root=insert(root,sc.nextInt());
System.out.println("Largest value in BST: "+findLargest(root));
}
}