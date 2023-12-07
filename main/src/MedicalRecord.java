public class MedicalRecord {

    private String patientName;
    private String patientID;
    private String diagnosis;
    private String prescription;
    private String nextAppointment;
    private static int counter = 0;
    private int patientCount;

    public MedicalRecord(String patientName, String patientID, String diagnosis, String prescription,
            String nextAppointment) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.nextAppointment = nextAppointment;
        counter++;
        this.patientCount = counter;
    }

    public void displayMedicalRecord() {
        System.out.println("\nMedical Record for Patient " + this.patientCount + ":");
        System.out.println("Patient Name: " + this.patientName);
        System.out.println("Patient ID: " + this.patientID);
        System.out.println("Diagnosis " + this.diagnosis);
        System.out.println("Prescription: " + this.prescription);
        System.out.println("Next Appointment: " + this.nextAppointment);
        System.out.println();
    }

    public String getPatientName() {
        return this.patientName;
    }

    public String getPatientID() {
        return this.patientID;
    }

    public String getDiagnosis() {
        return this.diagnosis;
    }

    public String getPrescription() {
        return this.prescription;
    }

    public String getNextAppointment() {
        return this.nextAppointment;
    }

    public void updateDiagnosis(String diagnosis) {
        System.out.println("Updating Diagnosis for Patient " + this.patientCount + " to " + diagnosis);
        this.diagnosis = diagnosis;
    }

    public void updatePrescription(String prescription) {
        System.out.println("Updating Prescription for Patient " + this.patientCount + " to " + prescription);
        this.prescription = prescription;
    }

    public void updateNextAppointment(String newAppointmentDate) {
        System.out.println("Updating Next Appointment for Patient " + this.patientCount + " to " + newAppointmentDate);
        this.nextAppointment = newAppointmentDate;
    }

    public static void main(String[] args) {
        MedicalRecord patient1 = new MedicalRecord("John Doe", "12345", "Influenza", "Tamiflu", "2023-04-15");
        MedicalRecord patient2 = new MedicalRecord("Jane Smith", "67890", "Hypertension", "Lisinopril", "2023-05-10");

        patient1.displayMedicalRecord();
        patient2.displayMedicalRecord();

        patient1.updateDiagnosis("Migraine");
        patient1.updatePrescription("Excedrin");
        patient1.updateNextAppointment("2023-05-15");

        patient2.updateDiagnosis("Allergy");
        patient2.updatePrescription("Allergia");
        patient2.updateNextAppointment("2024-06-11");

        patient1.displayMedicalRecord();
        patient2.displayMedicalRecord();
    }
}