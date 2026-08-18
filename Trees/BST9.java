import java.util.*;
class Node {
int data;
Node left, right;
Node(int value) { data = value; left = right = null; }
}
class BST {
Node root;
Node insert(Node root, int value) {
if (root == null) return new Node(value);
if (value < root.data) root.left = insert(root.left, value);
else root.right = insert(root.right, value);
return root;
}
void printLeafNodesPreorder(Node root) {
if (root == null) return;
if (root.left == null && root.right == null) {
System.out.print(root.data + " ");
}
printLeafNodesPreorder(root.left);
printLeafNodesPreorder(root.right);
}}
public class BST9 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
BST tree = new BST();
System.out.print("Enter number of nodes: ");
int n = sc.nextInt();
for (int i = 0; i < n; i++) {
int val = sc.nextInt();
tree.root = tree.insert(tree.root, val);
}
System.out.println("Leaf Nodes (Preorder):");
tree.printLeafNodesPreorder(tree.root);
}
}