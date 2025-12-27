package Task1;

public class PatientList {
    Node head; //head of the list

    //Constructor
    public PatientList() {
        this.head = null;
    }

    //Adding a patient end of the list (Linkedlist logic)
    //in linked list adding -> O(n)
    public void addPatient(Patient p) {
        Node newNode = new Node(p); //Creating newNode new patient
        if(head == null) { //if linked list empty then newNode will be head
            head = newNode;
            return;
        }
        else {
            /*if linked list not empty
            we are creating temporary variable for go around the list until find the last node
            */
            Node current = head; //current(temporary variable) equals to head
            while(current.next!= null) {
                current = current.next; //for going to last node we are improving current with equals current.next
            }
            current.next = newNode; //if we found the last node then it will be newNode
            //So, we are adding the newNode to the last node
        }
    }

    public void removePatient(int id) {
        //This method removes a patient from the list by a key(id)
        //deletion at a position(in this example position will be the id) Time Complexity -> O(n)
        if (head == null) { //if list empty do nothing
            return;
        }
        if(head.data.getId() == id) { //if head's id equals to id
            //then we are deleting by equals to head to head.next
            //likewise we are jumping the first head
            head = head.next;
            return;
        }
        Node prev = null; //firstly prev hold the null
        Node current = head; //creating temporary variable (current) and it will be starting head
        //for searching the id we want
        while(current.next != null && current.data.getId() != id) { //we are looking if we are end of the list and
            //current's data's id not equal to id therefore we are go around the list until our conditions fail
            prev = current; //each time we are holding the current with prev
            current = current.next; //and we are improving current
        }
        if(current == null){ //if patient not found
            return;
        }
        prev.next = current.next; //in this line we are jumping with prev.next = current.next
        //also prev = current's prev so actually
    }


    public Patient findPatient(int id) {
        //findPatient method searching patient(finding the patient) with key(id)
        //Time complexity O(n)
        Node current = head; //we are creating temporary variable(current) and it stars with head
        while(current != null) { //we are looking the entire list
            if(current.data.getId() == id) { //if we found
                return current.data; //return current.data
            }
            current = current.next; //if we couldn't found walk around the nodes
        }

        return null;
    }

    public void printList() {
        //prints the all list
        Node current = head; //starts with head
        if(current == null) {//if list is empty
            System.out.println("List is empty....");
        }
        while(current != null) {//if list doesn't empty we are walking around the entire list
            current.data.information(); //every current until (it becomes null ) calling the information method
            current = current.next; //we are improving the current
        }
    }

    //new method for task4
    public Patient[] toArray() {
        //turning linked list to array
        int count = 0;
        Node temp = head;
        while (temp!= null){
            count++;
            temp = temp.next;
        }
        Patient[] array = new Patient[count];;
        Node current = head;
        int index = 0;
        while(current != null){
            array[index] = current.data;
            index++;
            current = current.next;
        }
        return array;
    }
}
