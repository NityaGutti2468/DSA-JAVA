import java.util.*;
class Node{
int data;
Node left,right;
Node(int data){
this.data=data;
left=right=null;
}
}
class BST19{
Node insert(Node root,int key){
if(root==null)
return new Node(key);
if(key<root.data)
root.left=insert(root.left,key);
else if(key>root.data)
root.right=insert(root.right,key);
return root;
}
void printInterior(Node root){
if(root!=null){
if(!(root.left==null&&root.right==null))
System.out.print(root.data+" ");
printInterior(root.left);
printInterior(root.right);
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
BST19 obj=new BST19();
Node root=null;
System.out.println("Enter number of nodes:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
root=obj.insert(root,sc.nextInt());
System.out.println("Interior nodes using Preorder:");
obj.printInterior(root);
}
}