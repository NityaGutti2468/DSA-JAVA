import java.util.*;
class Node{
int data;
Node left,right;
Node(int data){
this.data=data;
left=right=null;
}
}
class BST17{
Node insert(Node root,int key){
if(root==null)
return new Node(key);
if(key<root.data)
root.left=insert(root.left,key);
else if(key>root.data)
root.right=insert(root.right,key);
return root;
}
int BST17(Node root){
if(root==null)
return 0;
Queue<Node> q=new LinkedList<>();
q.add(root);
int count=0;
while(!q.isEmpty()){
Node temp=q.poll();
if(temp.left==null&&temp.right==null)
count++;
if(temp.left!=null)
q.add(temp.left);
if(temp.right!=null)
q.add(temp.right);
}
return count;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
BST17 obj=new BST17();
Node root=null;
System.out.print("Enter number of nodes:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
root=obj.insert(root,sc.nextInt());
System.out.println("Leaf count using Level Order: "+obj.BST17(root));
}
}