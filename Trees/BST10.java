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
void printLeafNodesPostorder(Node root) {
if (root == null) return;
printLeafNodesPostorder(root.left);
printLeafNodesPostorder(root.right);
if (root.left == null && root.right == null) {
System.out.print(root.data + " ");
}}}
public class BST10 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
BST tree = new BST();
System.out.print("Enter number of nodes: ");
int n = sc.nextInt();
for (int i = 0; i < n; i++) {
int val = sc.nextInt();
tree.root = tree.insert(tree.root, val);
}
System.out.println("Leaf Nodes (Postorder):");
tree.printLeafNodesPostorder(tree.root);
}
}