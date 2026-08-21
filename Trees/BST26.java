import java.util.*;
class Node{
int data;
Node left,right;
Node(int data){
this.data=data;
left=right=null;
}
}
class BST26{
Node insert(Node root,int key){
if(root==null)
return new Node(key);
if(key<root.data)
root.left=insert(root.left,key);
else if(key>root.data)
root.right=insert(root.right,key);
return root;
}
void printNodes(Node root){
if(root!=null){
printNodes(root.left);
if((root.left!=null&&root.right==null)||(root.left==null&&root.right!=null))
System.out.print(root.data+" ");
printNodes(root.right);
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
BST26 obj=new BST26();
Node root=null;
System.out.print("Enter number of nodes:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
root=obj.insert(root,sc.nextInt());
System.out.println("Interior nodes with 1 child using Inorder:");
obj.printNodes(root);
}
}