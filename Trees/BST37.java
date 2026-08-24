import java.util.*;
class Node{
int data;
Node left,right;
Node(int data){
this.data=data;
left=right=null;
}
}
class BST37{
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
if(root==null)
return;
Queue<Node> q=new LinkedList<>();
q.add(root);
while(!q.isEmpty()){
Node temp=q.poll();
if(temp.left==null&&temp.right!=null)
System.out.print(temp.data+" ");
if(temp.left!=null)
q.add(temp.left);
if(temp.right!=null)
q.add(temp.right);
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
BST37 obj=new BST37();
Node root=null;
System.out.println("Enter number of nodes:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
root=obj.insert(root,sc.nextInt());
System.out.println("Interior nodes with only right child using Level Order:");
obj.printNodes(root);
}
}