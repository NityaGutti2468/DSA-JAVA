import java.util.*;
class Node{
int data;
Node left,right;
Node(int data){
this.data=data;
left=right=null;
}
}
class BST13{
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
int count=0;
count+=countLeaf(root.left);
if(root.left==null&&root.right==null)
count++;
count+=countLeaf(root.right);
return count;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
BST13 obj=new BST13();
Node root=null;
System.out.print("Enter number of nodes:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
root=obj.insert(root,sc.nextInt());
System.out.println("Leaf count using Inorder: "+obj.countLeaf(root));
}
}