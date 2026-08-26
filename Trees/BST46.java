import java.util.*;
class Node{
int data;
Node left,right;
Node(int d){
data=d;
left=right=null;
}
}
public class BST46{
Node root;
Node insert(Node root,int data){
if(root==null) return new Node(data);
if(data<root.data) root.left=insert(root.left,data);
else root.right=insert(root.right,data);
return root;
}
static int height(Node root){
if(root==null) 
return 0;
return 1+Math.max(height(root.left),height(root.right));
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
BST46 tree=new BST46();
System.out.println("Enter number of nodes:");
int n=sc.nextInt();
for(int i=0;i<n;i++){
int val=sc.nextInt();
tree.root=tree.insert(tree.root,val);
}
System.out.println("Height (recursive): "+height(tree.root));
sc.close();
}
}