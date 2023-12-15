public class BrainMRIAnalysis {
    private String patientName;
    private String patientID;
    private String scanDate;
    private String brainRegion;
    private double[] imageData;

    public BrainMRIAnalysis(String patientName, String patientID, String scanDate) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.scanDate = scanDate;
    }

    public void setBrainRegion(String brainRegion) {
        this.brainRegion = brainRegion;
    }

    public void setImageData(double[] imageData) {
        this.imageData = imageData;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getScanDate() {
        return scanDate;
    }

    public String getBrainRegion() {
        return brainRegion;
    }

    public double[] getImageData() {
        return imageData;
    }

    public void printMRIRecord() {
        System.out.println("MRI Scan Record for Patient:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Scan Date: " + scanDate);
        System.out.println("Brain Region: " + brainRegion);
        System.out.print("Image Data: [");
        for (int i = 0; i < imageData.length; i++) {
            System.out.print(imageData[i]);
            if (i < imageData.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(", ...]");
        System.out.println();
    }

    public void analyzeBrainRegion() {
        printMRIRecord();
        System.out.println("Analyzing " + brainRegion + "...");
        String findings = "";
        switch (brainRegion) {
            case "Frontal Lobe":
                findings = "Mild reduction in frontal lobe activity.";
                break;
            case "Occipital Lobe":
                findings = "Normal activity in the occipital lobe.";
                break;
            case "Temporal Lobe":
                findings = "Further evaluation recommended for temporal lobe activity.";
                break;
            default:
                findings = "Findings for " + brainRegion + " not available.";
                break;
        }
        System.out.println("Findings: " + findings);
        System.out.println();
    }

    public static void main(String[] args) {
        BrainMRIAnalysis patient1 = new BrainMRIAnalysis("John Doe", "12345", "2023-03-15");
        BrainMRIAnalysis patient2 = new BrainMRIAnalysis("Jane Smith", "67890", "2023-03-18");

        patient1.setBrainRegion("Frontal Lobe");
        patient1.setImageData(new double[] { 0.12, 0.08, 0.16 });
        patient2.setBrainRegion("Occipital Lobe");
        patient2.setImageData(new double[] { 0.11, 0.09, 0.15 });

        patient1.analyzeBrainRegion();
        patient2.analyzeBrainRegion();

        System.out.println("Updating Brain Region for Patient 1 to Temporal Lobe...");
        System.out.println();
        patient1.setBrainRegion("Temporal Lobe");
        patient1.analyzeBrainRegion();
    }
}