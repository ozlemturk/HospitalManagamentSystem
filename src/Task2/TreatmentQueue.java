package Task2;
public class TreatmentQueue {
    //creating queue with singly linked list
    Node front; // shows the first element of the queue
    Node rear; //shows the last element


    public TreatmentQueue() {
        //Constructor
        this.front = null; //Firstly, queue is empty
        this.rear = null; //Firstly, queue is empty
    }

    public void enqueue(TreatmentRequest request) {
        //Add a new node to end of the queue
        Node newNode = new Node(request); //Creating new Node(newNode) with a request data
        if(rear == null) { //if the last node doesn't exist, this means queue is empty
            //Therefore
            front = rear = newNode; //our newNode become front and rear and queue has a one node and its newNode
            return; //exit the loop
        }
        rear.next = newNode; //else, in queue we hold the last node with rear and rear.next = newNode means newNode
        // adding the end of the list
        rear = newNode; //and newNode becomes the rear
    }

    public TreatmentRequest dequeue() {
        //in queue we are deleting node from the front
        if(front == null || rear == null) { //queue is empty so, it is queue underflow
            System.out.println("Queue underflow");
            return null;
        }
        TreatmentRequest remove = front.data; //we are holding the front data
        front = front.next; //and we are deleting the front
        if(front == null) {//if our queue, after that we are deleting and it  becomes null then
            rear = null; // must be null
        }
        return remove; //we are returning the remove data
    }

    public int size() {
        //this method returns the number of elements in queue
        int sizeNumber = 0; //firstly we didn't count anything therefore it is 0
        Node current = front; //we are creating current and it is equal to front(head)
        while(current != rear) { // we are going to rear and we count the node in the queue
            sizeNumber++; //we increment the sizeNumber for each node we visit
            current = current.next; //for going to last node(rear) we improving current by current = current.next
        }
        return sizeNumber; //after our while loop ends we are return the sizeNumber
    }

    public void printQueue() {
        //this method print the every node in queue
        if(front == null) { //if queue is empty
            System.out.println("Queue is empty");
            return;
        }

        Node current = front; //else, current our temporary variable and it begins with front

        while(current != null) {//until current becomes null
            current.data.information(); //for every node we are calling information() method from TreatmentRequest
            current = current.next; //then we are improving the current with current.next
        }
    }

    //new method for task4
    public boolean isEmpty(){
        //checking is empty
        if (front == null){
            return true;
        }
        return false;
    }








}
