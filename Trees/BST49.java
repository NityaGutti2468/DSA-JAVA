import java.util.*;
class Node{
int data;
Node left, right;
Node(int data){
this.data = data;
left = right = null;
}
}
public class BST49{
public static Node insert(Node root, int data){
if(root == null) 
return new Node(data);
if(data < root.data) 
root.left = insert(root.left, data);
else 
root.right = insert(root.right, data);
return root;
}
public static Map<Integer,Integer> nodes(Node root){
Map<Integer,Integer> levelCount = new HashMap<>();
if(root == null) 
return levelCount;
Queue<Node> q = new LinkedList<>();
q.add(root);
int level = 0;
while(!q.isEmpty()){
int size = q.size();
levelCount.put(level, size);
for(int i=0; i<size; i++){
Node curr = q.poll();
if(curr.left != null) q.add(curr.left);
if(curr.right != null) q.add(curr.right);
}
level++;
}
return levelCount;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of nodes: ");
int n = sc.nextInt();
Node root = null;
System.out.println("Enter " + n + " values:");
for(int i=0; i<n; i++){
int val = sc.nextInt();
root = insert(root, val);
}
Map<Integer,Integer> result = nodes(root);
System.out.println(result);

sc.close();
}
}