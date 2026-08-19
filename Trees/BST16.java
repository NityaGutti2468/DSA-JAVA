import java.util.*;
class Node{
int data;
Node left,right;
Node(int data){
this.data=data;
left=right=null;
}
}
class BST16{
Node insert(Node root,int key){
if(root==null)
return new Node(key);
if(key<root.data)
root.left=insert(root.left,key);
else if(key>root.data)
root.right=insert(root.right,key);
return root;
}
int countLeaf(Node root){
if(root==null)
return 0;
if(root.left==null&&root.right==null)
return 1;
return countLeaf(root.left)+countLeaf(root.right);
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
BST16 obj=new BST16();
Node root=null;
System.out.print("Enter number of nodes:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
root=obj.insert(root,sc.nextInt());
System.out.println("Leaf count using Direct Method: "+obj.countLeaf(root));
}
}