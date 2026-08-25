import java.util.*;
class Node{
int data;
Node left,right;
Node(int data){
this.data=data;
left=right=null;
}
}
class BST41{
static Node insert(Node root,int key){
if(root==null) return new Node(key);
if(key<root.data) root.left=insert(root.left,key);
else if(key>root.data) root.right=insert(root.right,key);
return root;
}
static int count=0;
static int secondLargest=-1;
static void reverseInorder(Node root){
if(root==null||count>=2) return;
reverseInorder(root.right);
count++;
if(count==2){
secondLargest=root.data;
return;
}
reverseInorder(root.left);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Node root=null;
System.out.println("Enter number of nodes:");
int n=sc.nextInt();
for(int i=0;i<n;i++) root=insert(root,sc.nextInt());
reverseInorder(root);
System.out.println("Second largest value in BST: "+secondLargest);
}
}