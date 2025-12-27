package Task3;

public class Node {
    DischargeRecord data; //Store's DischargeRecord data
    Node next; //Reference for the next node in stack

    Node(DischargeRecord data) {
        //Constructor
        this.data = data;
        this.next = null;
    }
}
