public class SortedLinkedList {
    private Node head;

    public SortedLinkedList(Node head) {
        this.head = head;
    }

    // Add method with sorting logic
    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null || head.data > value) {
            // Insert at the beginning if the list is empty or the new value is smaller
            newNode.next = head;
            head = newNode;
        } else {
            // Traverse the list to find the correct position
            Node current = head;
            while (current.next != null && current.next.data < value) {
                current = current.next;
            }

            // Insert the new node at the correct position
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int sizeOfLL(){
     int size=0;
     Node temp=head;
     while(temp!=null){
         temp=temp.next;
         size++;
     }
     return size;
    }

    public void deleteAtPos(int pos) {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node curr = head;
        int ind = 0;

        while (ind < pos - 1 && curr != null) {
            curr = curr.next;
            ind++;
        }

        // If the position is out of bounds
        if (curr == null || curr.next == null) {
            System.out.println("Invalid position");
            return;
        }

        // Update the next pointer to skip the node at the given position
        curr.next = curr.next.next;
    }
    public void append(int value){
        Node newNode= new Node(value);
         if(head==null){
            head= newNode;
         }
         else{
             Node temp = head;
             while(temp.next!=null){
                 temp= temp.next;
             }
             temp.next=newNode;

         }
    }
    public void pop(){
        if(head==null){
            System.out.println("Linked Listmis empty");
            return;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
    }
    public void popLast(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
     Node temp=head;
        while(temp.next.next!=null && temp.next!=null){
             temp=temp.next;
        }

        temp.next=null;
    }

    public Node findNode(int key){
        if(head==null || head.data==key) return head;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return temp;
            }
            temp=temp.next;

        }
        return null;
    }
    public void insertAfterKey(int key,int value){
        Node node= findNode(key);
        Node temp= node.next;
        Node newNode= new Node(value);
        node.next=newNode;
        newNode.next=temp;

    }
    public void insertAtPosition(int pos,int value){
        Node newNode= new Node(value);
        if(pos==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node curr=head;
        int ind=0;
        while(ind<pos-1 && curr!=null){
            curr=curr.next;
            ind++;
        }

        if(curr!=null){
            newNode.next=curr.next;
            curr.next=newNode;
        }

    }
    public void display(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("Null");
    }
}
