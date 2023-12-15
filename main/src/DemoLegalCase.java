public class DemoLegalCase {
    public static void main(String[] args) {
        LegalCase case1 = new LegalCase("LC1001", "John Doe", "Jane Smith", "Civil", "Open");
        LegalCase case2 = new LegalCase("LC1002", "Alice Brown", "Bob Johnson", "Criminal", "Open");

        case1.displayCaseDetails();
        case2.displayCaseDetails();

        case1.updateCaseStatus("Closed");
        System.out.println("Updated Case 1 Details:");
        case1.displayCaseDetails();
    }
}
