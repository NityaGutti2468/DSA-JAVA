import java.util.*;
class Node {
int data;
Node left, right;
Node(int data) {
this.data = data;
left = right = null;
}
}
public class BST42 {
Node root;
Node insert(Node root, int data) {
if (root == null)
return new Node(data);
if (data < root.data)
root.left = insert(root.left, data);
else
root.right = insert(root.right, data);
return root;
}
void leftView(Node root) {
if (root == null)
return;
Queue<Node> q = new LinkedList<>();
q.add(root);
while (!q.isEmpty()) {
int size = q.size();
for (int i = 0; i < size; i++) {
Node p1 = q.poll();
if (i == 0)
System.out.print(p1.data + " ");
if (p1.left != null)
q.add(p1.left);
if (p1.right != null)
q.add(p1.right);
}
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
BST42 tree = new BST42();
System.out.print("Enter number of nodes: ");
int n = sc.nextInt();
System.out.println("Enter node values:");
for (int i = 0; i < n; i++) {
int val = sc.nextInt();
tree.root = tree.insert(tree.root, val);
}
System.out.print("Left View: ");
tree.leftView(tree.root);
}
}