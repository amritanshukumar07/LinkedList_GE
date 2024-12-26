//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to day 9 linked list program");
        LinkedList ll= new LinkedList();
        Node first= new Node(56);
        Node second= new Node(30);
        Node third= new Node(70);

        ll.head=first;
        first.next=second;
        second.next=third;
        System.out.println("Linked List :");
        ll.display();
    }
}