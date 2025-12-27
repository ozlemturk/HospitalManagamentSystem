package Task3;

import static java.lang.System.exit;
//Creating stack with singly linked list

public class DischargeStack {
    Node top; //Shows the top of the stack
    public DischargeStack() {
        //Constructor
        this.top = null; //First, stack is empty
    }

    public void push(DischargeRecord record) {
        //add a new record to the top of the stack
        Node newNode = new Node(record); //Creating newNode
        if (newNode == null) { //checking memory location
            System.out.println("Heap Overflow");
            return;
        }
        newNode.data = record; //newNode data is record
        newNode.next = top; //newNode points to the top
        top = newNode; //Top is changed, therefore updating the top
    }

    public DischargeRecord pop() {
        //removes and returns the top node from the stack
        if(top == null) { //If top is equal to null
            System.out.println("Stack Underflow"); //Stack Undeflow condition
            return null;
        }
        DischargeRecord removed = top.data; //holding the top's data
        top = top.next; //Moving top to the next Node
        return removed;
    }
    public int peek() {
        //looks top of the stack and returns
        if(top != null){
            return top.data.getPatientId(); //returns the patientId of the top
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void printStack() {
        //prints all the discharge records from top to the bottom
        if(top == null) { //Stakc is empty
            System.out.println("Stack Underflow");
            return;
        }
        else {
            Node current = top;//creating current for traverse to the end
            while(current!= null) {
                current.data.information();
                current = current.next;
                if(current != null) {
                    System.out.print(" ->");
                }
            }
        }
    }
}
