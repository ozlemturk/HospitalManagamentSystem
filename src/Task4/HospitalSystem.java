package Task4;

import Task1.Patient;
import Task1.PatientList;
import Task2.TreatmentQueue;
import Task2.TreatmentRequest;
import Task3.DischargeRecord;
import Task3.DischargeStack;

import java.util.HashMap; //import HashMap

public class HospitalSystem {
    PatientList patientList; //Storing Patients in linked list
    TreatmentQueue normalQueue; //For normal treatment request
    TreatmentQueue priorityQueue; //For priority treatment request
    DischargeStack dischargeStack; //Storing discharged patients
    HashMap<Integer, Patient> patientMap; //HashMap



    HospitalSystem() {
        //Constructor
        //initialize all data structures in constructor
        patientList = new PatientList();
        normalQueue = new TreatmentQueue();
        priorityQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();
    }

    public void addPatient(Patient p){
        //Adds a patient to the patientList and patientMap
        patientList.addPatient(p);
        patientMap.put(p.getId(), p);
    }

    public void addRequest(TreatmentRequest request){
        //Adds a treatment request for queue
        if(request.getisPriority()){ //if this request has a priority
            priorityQueue.enqueue(request); //then add a request to the priortiyQueue
        }
        else{
            normalQueue.enqueue(request); //Otherwise, add a request to the normalQueue
        }
    }


    public void addRecord(DischargeRecord record){
        //Adds a record to the Discharge Stack
        dischargeStack.push(record);
    }

    public void processTreatmentRequest(){
        TreatmentRequest request;
        if(priorityQueue.isEmpty()){//Firstly, priority queue is checked
            if(normalQueue.isEmpty()){
                System.out.println("No patient"); //There is no patients
                return;
            }
            else{
                request = normalQueue.dequeue();//Then takes normal queue if priority queue is empty

            }
        }
        else {//if priority queue is not empty
            request = priorityQueue.dequeue(); //takes from priority queue

        }

        Patient patient = patientMap.get(request.getPatientId());//Retrieve patient information using HashMap
        //Creating and pushing the record
        DischargeRecord newRecord = new DischargeRecord(patient.getId());
        dischargeStack.push(newRecord);
    }

    public static void insertionSort(Patient[] array){
        //Insertion sort algorithm
        //We use this algorithm to sort patients by severity
        for(int i = 1; i < array.length; i++){ //We accepted the first elements is already sorted
            Patient key = array[i]; //Patient to be positioned
            int j = i -1; //Looking for the left
            while(j >= 0 && array[j].getSeverity() < key.getSeverity()){ //checking for the if the left patients has a bigger severity for the others
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = key;//Placing the patient in the correct position
        }

    }


    public void sortingWithSeverity(){
        //Converts patient list to array and sorts by severity
        Patient[] patients = patientList.toArray(); //Converting linked list to Array time complexity is -> O(n)
        insertionSort(patients); //sorting by using insertionSort time complexity is O(n^2)

        for(int i = 0; i<patients.length ; i++){//Printing sorted patients
            System.out.println(patients[i].getId() + " severity: "+ patients[i].getSeverity());
        }

    }


    public void printSystemState(){//Printing the current state of the system
        System.out.println("----HOSPITAL SYSTEM STATE----");
        System.out.println("\n\n\n\n");
        System.out.println("Patient List");
        patientList.printList();
        System.out.println("\nPriority Treatment Queue");
        priorityQueue.printQueue();
        System.out.println("\nNormal Treatment Queue");
        normalQueue.printQueue();
        System.out.println("\nDischargeStack");
        dischargeStack.printStack();
    }




}
