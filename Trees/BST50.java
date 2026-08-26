import java.util.*;
class Node{
int data;
Node left, right;
Node(int data){
this.data = data;
left = right = null;
}
}
public class BST50{
public static Node insert(Node root, int data){
if(root == null) 
return new Node(data);
if(data < root.data) 
root.left = insert(root.left, data);
else 
root.right = insert(root.right, data);
return root;
}
public static Node NextRight(Node root, int x){
if(root == null) return null;
Queue<Node> q = new LinkedList<>();
q.add(root);
while(!q.isEmpty()){
int size = q.size();
for(int i=0; i<size; i++){
Node curr = q.poll();
if(curr.data == x){
if(i == size-1) return null;
return q.peek();
}
if(curr.left != null) 
q.add(curr.left);
if(curr.right != null) 
q.add(curr.right);
}
}
return null;
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of nodes: ");
int n = sc.nextInt();
Node root = null;
for(int i=0; i<n; i++){
int val = sc.nextInt();
root = insert(root, val);
}
System.out.print("Enter value x: ");
int x = sc.nextInt();
Node nextRight = NextRight(root, x);
if(nextRight != null) System.out.println("Next right of " + x + " is " + nextRight.data);
else System.out.println("No next right node for " + x);
sc.close();
}
}