package Task2;

public class Node {
    //Node of the queue
    TreatmentRequest data; //Stores TreatmentRequest's data
    Node next; // Reference for the next node in queue

    Node(TreatmentRequest d) {
        //Constructor
        this.data = d;
        this.next = null;
    }
}
