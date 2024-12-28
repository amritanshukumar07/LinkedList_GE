//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to day 9 linked list program\n");
        Node start= new Node(56);
        SortedLinkedList ll= new SortedLinkedList(start);
        ll.add(30);
        ll.add(40);
        ll.add(70);
        System.out.println("Linked List :");
        ll.display();
//        ll.insertAfterKey(30,40);
//        System.out.println("The LL after inserting after a key is: ");
//        ll.display();
//        ll.deleteAtPos(3);
//        System.out.println("Size of LL after deletion :"+ ll.sizeOfLL() +"\nLinked list after deletion");
//        ll.display();

    }
}