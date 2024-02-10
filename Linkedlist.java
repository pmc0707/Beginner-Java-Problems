public class Linkedlist{
    public static class Node {
    
        int data ;
        Node next;
        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail= newNode;
            return;
        }
        newNode.next = head;
        head= newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
  
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
     public void print(){
        if(head == null){
            System.out.println("lll is empty");
            return;
        }
        Node temp = head;
         while(temp!=null){
         System.out.print(temp.data + "->");
         temp = temp.next;   
     }
        System.out.println("Null");
     } 
     public void add(int idx , int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode  = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while( i< idx - 1){
             temp = temp.next ;
             i++;
        }
        newNode.next = temp. next;
        temp.next= newNode;
     }
     public int removeFirst(){
        if (size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size== 1){
            int val = head.data;
            head = tail = null;
             size = 0;
            return val;
           

        }
        int val = head.data;
        head = head.next;
        size --;
        return val;
     } 
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;

        }
        else if(size== 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        Node prev= head;
        for(int i = 0;i<size-2;i++){
            
            prev=prev.next;

        }
        int val=prev.next.data;
        prev.next= null;
        tail= prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp = head;
        int i= 0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail=head;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        head = prev;
    }
    // delete nth 
    public void deleteNthfromEnd(int n){
        int sz = 0;
        Node temp = head;
        while (temp!=null){
            temp= temp.next;
            sz++;
        }
        if(n==sz){
            head = head.next;//remove first opr
            return;

        }
        int i=1;
        int iToFind= sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public node findMode(Node head){
        Node slow = head;
        Node flow = head;
        while(fast!=null && fast.next !=null ){
            slow = slow.next;
            fast = fast.next .next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.itrSearch(4));
        System.out.println(ll.itrSearch(10));
        ll.reverse();;
        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();
    }
}