import java.util.*;
class Node{
int data;
Node left,right;
Node(int data){
this.data=data;
left=right=null;
}
}
class BST40{
static Node insert(Node root,int key){
if(root==null) return new Node(key);
if(key<root.data) root.left=insert(root.left,key);
else if(key>root.data) root.right=insert(root.right,key);
return root;
}
static int findSecondSmallest(Node root){
if(root==null) throw new NoSuchElementException("BST is empty");
Stack<Node> stack=new Stack<>();
Node current=root;
int count=0;
while(current!=null||!stack.isEmpty()){
while(current!=null){
stack.push(current);
current=current.left;
}
current=stack.pop();
count++;
if(count==2) return current.data;
current=current.right;
}
throw new NoSuchElementException("BST has fewer than 2 nodes");
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Node root=null;
System.out.println("Enter number of nodes:");
int n=sc.nextInt();
for(int i=0;i<n;i++) root=insert(root,sc.nextInt());
System.out.println("Second smallest value in BST: "+findSecondSmallest(root));
}
}