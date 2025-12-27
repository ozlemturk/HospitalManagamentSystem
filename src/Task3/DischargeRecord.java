package Task3;

public class DischargeRecord {
    //Stores information about discharged patients
    int patientId; //ID of patient
    long dischargeTime; //Time when the patient was discharged

    public DischargeRecord(int patientId) {
        //Constructor
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis(); // we are getting time with System.currentTimeMillis
    }

    //Getter methods
    public int getPatientId() {
        //getter for patient ID
        return patientId;
    }

    public long getDischargeTime() {
        //Getter for discharge time
        return dischargeTime;
    }

    public void information() {
        //Prints the information about patients
        System.out.println("Information: " + "\nPatient ID: " + getPatientId() + "\nDischarge Time: "+ getDischargeTime());
    }
}
