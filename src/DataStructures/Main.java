package DataStructures;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> ll;
        ll = new LinkedList<Integer>(null);

        ll.add(6);
        ll.add(4);
        ll.add(7);
        ll.add(7);
        ll.add(7);
        ll.add(7);
        ll.delete(2);
        ll.printl();
    }
}
