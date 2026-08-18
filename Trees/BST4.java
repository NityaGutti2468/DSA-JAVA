import java.util.Scanner;
public class BST4 {
static Node root = null;
static class Node {
int data;
Node left, right;
Node(int x) {
data = x;
left = null;
right = null;
}
}
static Node insert(Node root, int x) {
Node newNode = new Node(x);
if (root == null) return newNode;
Node curr = root;
Node parent = null;
while (curr != null) {
parent = curr;
if (x < curr.data) curr = curr.left;
else if (x > curr.data) curr = curr.right;
else {
System.out.println("Duplicate value not allowed");
return root;
}
}
if (x < parent.data) parent.left = newNode;
else parent.right = newNode;
return root;
}
static void postorderLeaf(Node root) {
if (root == null) return;
postorderLeaf(root.left);
postorderLeaf(root.right);
if (root.left == null && root.right == null) System.out.print(root.data + " ");
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of nodes: ");
int n = sc.nextInt();
for (int i = 1; i <= n; i++) {
root = insert(root, sc.nextInt());
}
System.out.print("Leaf nodes using Postorder: ");
postorderLeaf(root);
sc.close();
}
}