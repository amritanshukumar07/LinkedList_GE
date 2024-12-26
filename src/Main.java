//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to day 9 linked list program");
        Node start= new Node(56);
        LinkedList ll= new LinkedList(start);
        ll.append(30);
        ll.append(70);
        System.out.println("Linked List :");
        ll.display();
    }
}