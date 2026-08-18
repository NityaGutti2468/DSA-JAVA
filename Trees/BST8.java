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
else if (value > root.data) root.right = insert(root.right, value);
return root;
}
void inorder(Node root) {
if (root == null) return;
inorder(root.left);
System.out.print(root.data + " ");
inorder(root.right);
}
Node delete(Node root, int key) {
if (root == null) return null;
if (key < root.data) root.left = delete(root.left, key);
else if (key > root.data) root.right = delete(root.right, key);
else {
if (root.left == null) return root.right;
else if (root.right == null) return root.left;
Node succ = minValueNode(root.right);
root.data = succ.data;
root.right = delete(root.right, succ.data);
}
return root;
}
Node minValueNode(Node node) {
Node curr = node;
while (curr.left != null) curr = curr.left;
return curr;
}
}
public class BST8 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
BST tree = new BST();
System.out.print("Enter number of nodes: ");
int n = sc.nextInt();
for (int i = 0; i < n; i++) {
int val = sc.nextInt();
tree.root = tree.insert(tree.root, val);
}
System.out.println("Inorder Traversal before deletion:");
tree.inorder(tree.root);

System.out.print("\nEnter node to delete: ");
int x = sc.nextInt();
tree.root = tree.delete(tree.root, x);

System.out.println("Inorder Traversal after deletion:");
tree.inorder(tree.root);
}
}