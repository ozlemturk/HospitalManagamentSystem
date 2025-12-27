package Task1;

public class Patient {
    //Variables
    int id; //integer
    String name; //String
    int severity; //int
    int age; // int

    //Constructor
    public Patient(int id, String name, int severity, int age) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }

    //getter and setter methods
    public int getId() {
        return id; //returns patient ID
    }

    public void setId(int id) {
        this.id = id; //Sets patient ID
    }

    public String getName() {
        return name; //returns patient name
    }

    public void setName(String name) {
        this.name = name; //sets patient name
    }

    public int getSeverity() {
        return severity; //returns patient severity
    }

    public void setSeverity(int severity) {
        //sets patient severity
        if (1 <= severity && severity <= 10) {
            this.severity = severity;
        }
        return ;

    }

    public int getAge() {
        return age; //returns patient age
    }

    public void setAge(int age) {
        this.age = age; //sets patient age
    }

    //prints patient information
    public void information() {
        System.out.println("Task1.Patient Information:" + "\nID: " + id + "\nName: "+ name + "\nSeverity: " + severity + "\nAge: "+age);
    }


}
