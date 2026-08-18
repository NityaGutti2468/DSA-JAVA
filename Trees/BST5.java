import java.util.*;
class Node {
int data;
Node left, right;
Node(int value) {
data = value;
left = right = null;
}
}
class BST {
Node root;
Node insert(Node root, int value) {
if (root == null) return new Node(value);
if (value < root.data) root.left = insert(root.left, value);
else root.right = insert(root.right, value);
return root;
}
void levelOrder(Node root) {
if (root == null) return;
Queue<Node> q = new LinkedList<>();
q.offer(root);
while (!q.isEmpty()) {
int n = q.size();
for (int i = 0; i < n; i++) {
Node p1 = q.poll();
System.out.print(p1.data + " ");
if (p1.left != null) q.offer(p1.left);
if (p1.right != null) q.offer(p1.right);
}}}}
public class BST5 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
BST tree = new BST();
System.out.print("Enter number of nodes: ");
int n = sc.nextInt();
for (int i = 0; i < n; i++) {
int val = sc.nextInt();
tree.root = tree.insert(tree.root, val);
}
System.out.println("Level Order Traversal:");
tree.levelOrder(tree.root);
}
}