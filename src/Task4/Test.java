package Task4;
import Task1.Patient;
import Task2.TreatmentRequest;
import Task3.DischargeRecord;

public class Test {
    public static void main(String[] args){
        //Creating Hospital System
        HospitalSystem hospitalSystem = new HospitalSystem();

        //Creating patients
        Patient patient1 = new Patient(1,"Burcu", 1, 22);
        Patient patient2 = new Patient(2, "Zeynep",1,23);
        Patient patient3 = new Patient(3, "Yağmur", 9,22);
        Patient patient4 = new Patient(4, "Selcan",10,28);
        Patient patient5 = new Patient(5, "Aslı",5, 48);
        Patient patient6 = new Patient(6, "Eda",3,20);
        Patient patient7 = new Patient(7, "Buke",7,21);
        Patient patient8 = new Patient(8, "Ceyda",10,21);
        Patient patient9 = new Patient(9, "Cesur",2,21);
        Patient patient10 = new Patient(10, "Deniz",5, 21);

        //Adding patients to the system
        hospitalSystem.addPatient(patient1);
        hospitalSystem.addPatient(patient2);
        hospitalSystem.addPatient(patient3);
        hospitalSystem.addPatient(patient4);
        hospitalSystem.addPatient(patient5);
        hospitalSystem.addPatient(patient6);
        hospitalSystem.addPatient(patient7);
        hospitalSystem.addPatient(patient8);
        hospitalSystem.addPatient(patient9);
        hospitalSystem.addPatient(patient10);



        //Creating treatment requests
        TreatmentRequest treatmentRequest1 = new TreatmentRequest(1);
        TreatmentRequest treatmentRequest2 = new TreatmentRequest(2);
        TreatmentRequest treatmentRequest3 = new TreatmentRequest(3, true);
        TreatmentRequest treatmentRequest4 = new TreatmentRequest(4, true);
        TreatmentRequest treatmentRequest5 = new TreatmentRequest(5);
        TreatmentRequest treatmentRequest6 = new TreatmentRequest(6);
        TreatmentRequest treatmentRequest7 = new TreatmentRequest(7);
        TreatmentRequest treatmentRequest8 = new TreatmentRequest(8, true);
        TreatmentRequest treatmentRequest9 = new TreatmentRequest(9);
        TreatmentRequest treatmentRequest10 = new TreatmentRequest(10);

        //Adding treatment requests to the system
        hospitalSystem.addRequest(treatmentRequest1);
        hospitalSystem.addRequest(treatmentRequest2);
        hospitalSystem.addRequest(treatmentRequest3);
        hospitalSystem.addRequest(treatmentRequest4);
        hospitalSystem.addRequest(treatmentRequest5);
        hospitalSystem.addRequest(treatmentRequest6);
        hospitalSystem.addRequest(treatmentRequest7);
        hospitalSystem.addRequest(treatmentRequest8);
        hospitalSystem.addRequest(treatmentRequest9);
        hospitalSystem.addRequest(treatmentRequest10);

        //Printing initial system state
        hospitalSystem.printSystemState();

        //Creating discharge records
        DischargeRecord record1 = new DischargeRecord(1);
        DischargeRecord record2 = new DischargeRecord(2);

        //Adding records to the system
        hospitalSystem.addRecord(record1);
        hospitalSystem.addRecord(record2);

        //Process treatment requests
        hospitalSystem.processTreatmentRequest();
        hospitalSystem.processTreatmentRequest();
        hospitalSystem.processTreatmentRequest();
        hospitalSystem.processTreatmentRequest();


        //Printing final system state
        hospitalSystem.printSystemState();





    }
}
