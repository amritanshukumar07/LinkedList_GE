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
