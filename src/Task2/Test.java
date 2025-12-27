package Task2;

public class Test {
    public static void main(String[] args) {
        //We are creating new treatment queue object
        TreatmentQueue queue = new TreatmentQueue();

        //Creating treatment requests
        TreatmentRequest treatmentRequest1 = new TreatmentRequest(1);
        TreatmentRequest treatmentRequest2 = new TreatmentRequest(2);
        TreatmentRequest treatmentRequest3 = new TreatmentRequest(3);
        TreatmentRequest treatmentRequest4 = new TreatmentRequest(4);
        TreatmentRequest treatmentRequest5 = new TreatmentRequest(5);
        TreatmentRequest treatmentRequest6 = new TreatmentRequest(6);
        TreatmentRequest treatmentRequest7 = new TreatmentRequest(7);
        TreatmentRequest treatmentRequest8 = new TreatmentRequest(8);



        //Adding the objects to the queue
        queue.enqueue(treatmentRequest1);
        queue.enqueue(treatmentRequest2);
        queue.enqueue(treatmentRequest3);
        queue.enqueue(treatmentRequest4);
        queue.enqueue(treatmentRequest5);
        queue.enqueue(treatmentRequest6);
        queue.enqueue(treatmentRequest7);
        queue.enqueue(treatmentRequest8);

        //Removing first 3 objects
        //in queue we are deleting (dequeue) from beginning
        //it is FIFO
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        //printing the queue
        queue.printQueue();






    }
}
