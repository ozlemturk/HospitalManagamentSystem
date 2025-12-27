package Task2;
public class TreatmentRequest {
    //Represents a treatment request mading by a patient
    int patientId; //patient ID
    long arrivalTime;//arrivalTime holds the time when request arrive
    boolean priority;

    //Constructor
    public TreatmentRequest(int patientId){
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis(); //it equals to current system time
        this.priority = false;
    }

    //Constructor
    public TreatmentRequest(int patientId, boolean priority){
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis(); //it equals to current system time
        this.priority = priority;
    }

    //Getter methods
    public int getPatientId() {
        //returns patientId
        return patientId;
    }

    public long getArrivalTime() {
        //returns arrivalTime
        return arrivalTime;
    }

    public void information() {
        //This method prints the information of patient
        System.out.println("Information: " + "\nPatient ID: " + getPatientId() + "\nArrival Time: "+ getArrivalTime());
    }

    //new method for task4
    public boolean getisPriority(){
        return priority;
    }

}
