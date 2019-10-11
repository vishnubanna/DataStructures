package DataStructures;

// search add and delete time == O(n)
public class LinkedList <AnyType>{
    // subclass is wrapped by LinkedList, declared private so it can only be used with in LinkedList
    // static so i dont need to use node head;
    // head = new node

    private static class Node<AnyType>{
        private AnyType data;
        private Node<AnyType> next;

        public Node(AnyType data, Node<AnyType> next){
            this.data = data;
            this.next = next;
        }
    }

    private static Node head;
    private static int length = 0; // var tha can be accessed anywhere in the funtion

    public LinkedList(AnyType data){ // constructor method
        head = new Node<AnyType>(data, null);
    }

    public void add(AnyType data){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node<AnyType>(data, null);
        length++;
        return;
    }

    public boolean delete(int index){
        if (index > length || index == 0){
            return false;
        }
        else if(index == length){
            Node temp = head;
            while (temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
        else if(index == 1){
            head.next = head.next.next;
        }
        else{
            Node temp = head;
            int counter = 1; // if counter starts at 0 it is 0 indexed, starts at 1 it is 1 indexed
            while (counter < index && counter < length - 1){
                temp = temp.next;
                counter++;
            }
            temp.next = temp.next.next;
        }
        length --;
        return true;
    }

    public boolean isEmpty(){
        if (head.next == null){return true;}
        return false;
    }

    public void printl(){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
            System.out.print(temp.data + "" + " ");
        }
    }
}
