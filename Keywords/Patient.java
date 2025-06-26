class Patient {
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayPatient() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
        }
    }
}
