public class LinkedList {
    public Node head;
    public LinkedList(Node head){
        this.head=head;
    }
    public void add(int value){
        Node newNode= new Node(value);
        newNode.next=head;
        head= newNode;
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
