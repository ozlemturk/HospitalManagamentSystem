package Task1;

public class Node {
    /*
    This node class represent linked list(singly)
    */
    Patient data; //data stored in Patient
    Node next; //next will be referenced to the next Node


    Node(Patient d) {
        //Constructor
        this.data = d;
        this.next = null;
    }


}
