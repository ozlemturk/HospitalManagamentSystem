package Task1;

public class Test {
    public static void main(String[] args) {
        //Creating patients object
        Patient patient1 = new Patient(1,"Burcu", 1, 22);
        Patient patient2 = new Patient(2, "Zeynep",1,23);
        Patient patient3 = new Patient(3, "Yağmur", 9,22);
        Patient patient4 = new Patient(4, "Selcan",10,28);
        Patient patient5 = new Patient(5, "Aslı",5, 48);

        //Creating a PatientList
        PatientList patientList = new PatientList();

        //adding patients to the list
        patientList.addPatient(patient1);
        patientList.addPatient(patient2);
        patientList.addPatient(patient3);
        patientList.addPatient(patient4);
        patientList.addPatient(patient5);

        //removing patient by id
        patientList.removePatient(1);

        //Finding the patient by id
        Patient found = patientList.findPatient(4);
        //if patient is found and not equal to null
        if (found != null) {
           found.information(); //then print patient information
        }

        patientList.printList(); //printing the entire list


    }
}