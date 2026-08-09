import java.util.Scanner;
class Node {
int data;
Node next;
Node(int data, Node next) {
this.data = data;
this.next = next;
}
}
public class LL1 {
static Node insertFirst(Node head, int x) {
Node p = new Node(x);
p.next = head;
return p;
}
static Node insertLast(Node head, int x) {
Node p = new Node(x);
if (head == null)
return p;
Node p1 = head;
while (p1.next != null)
p1 = p1.next;
p1.next = p;
return head;
}
static Node insertAtPos(Node head, int x, int pos) {
if (pos <= 1)
return insertFirst(head, x);
Node p1 = head;
for (int i = 1; i < pos - 1 && p1 != null; i++)
p1 = p1.next;
if (p1 == null)
return head;
Node p = new Node(x);
p.next = p1.next;
p1.next = p;
return head;
}
static Node deleteFirst(Node head) {
if (head == null)
return null;
return head.next;
}

    static Node deleteLast(Node head) {
        if (head == null)
            return null;

        if (head.next == null)
            return null;

        Node p1 = head;
        while (p1.next.next != null)
            p1 = p1.next;

        p1.next = null;
        return head;
    }

    static Node deleteAtPos(Node head, int pos) {
        if (head == null)
            return null;

        if (pos <= 1)
            return deleteFirst(head);

        Node p1 = head;
        for (int i = 1; i < pos - 1 && p1.next != null; i++)
            p1 = p1.next;

        if (p1.next == null)
            return head;

        p1.next = p1.next.next;
        return head;
    }

    /* -------- TRAVERSE -------- */

    static void traverse(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    /* -------- MAIN (NESTED MENU) -------- */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        int choice, subChoice, x, pos;

        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Traverse");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- INSERT MENU ---");
                    System.out.println("1. Insert at Beginning");
                    System.out.println("2. Insert at End");
                    System.out.println("3. Insert at Position");
                    System.out.print("Enter choice: ");
                    subChoice = sc.nextInt();

                    if (subChoice == 1) {
                        System.out.print("Enter value: ");
                        x = sc.nextInt();
                        head = insertFirst(head, x);
                    } 
                    else if (subChoice == 2) {
                        System.out.print("Enter value: ");
                        x = sc.nextInt();
                        head = insertLast(head, x);
                    } 
                    else if (subChoice == 3) {
                        System.out.print("Enter value and position: ");
                        x = sc.nextInt();
                        pos = sc.nextInt();
                        head = insertAtPos(head, x, pos);
                    } 
                    else {
                        System.out.println("Invalid insert choice");
                    }
                    break;

                case 2:
                    System.out.println("\n--- DELETE MENU ---");
                    System.out.println("1. Delete from Beginning");
                    System.out.println("2. Delete from End");
                    System.out.println("3. Delete from Position");
                    System.out.print("Enter choice: ");
                    subChoice = sc.nextInt();

                    if (subChoice == 1) {
                        head = deleteFirst(head);
                    } 
                    else if (subChoice == 2) {
                        head = deleteLast(head);
                    } 
                    else if (subChoice == 3) {
                        System.out.print("Enter position: ");
                        pos = sc.nextInt();
                        head = deleteAtPos(head, pos);
                    } 
                    else {
                        System.out.println("Invalid delete choice");
                    }
                    break;

                case 3:
                    traverse(head);
                    break;

                case 4:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid main menu choice");
            }
        }
    }
}
