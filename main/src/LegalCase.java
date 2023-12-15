class LegalCase {
    private String caseNumber;
    private String plaintiffName;
    private String defendantName;
    private String caseType;
    private String caseStatus;

    public LegalCase(String caseNumber, String plaintiffName, String defendantName, String caseType,
            String caseStatus) {
        this.caseNumber = caseNumber;
        this.plaintiffName = plaintiffName;
        this.defendantName = defendantName;
        this.caseType = caseType;
        this.caseStatus = caseStatus;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public void setPlaintiffName(String plaintiffName) {
        this.plaintiffName = plaintiffName;
    }

    public void setDefendantName(String defendantName) {
        this.defendantName = defendantName;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getCaseNumber() {
        return this.caseNumber;
    }

    public String getPlaintiffName() {
        return this.plaintiffName;
    }

    public String getDefendantName() {
        return this.defendantName;
    }

    public String getCaseType() {
        return this.caseType;
    }

    public String getCaseStatus() {
        return this.caseStatus;
    }

    public void updateCaseStatus(String newStatus) {
        this.caseStatus = newStatus;
    }

    public void displayCaseDetails() {
        System.out.println("Case Number: " + this.caseNumber);
        System.out.println("Plaintiff Name: " + this.plaintiffName);
        System.out.println("Defendant Name: " + this.defendantName);
        System.out.println("Case Type: " + this.caseType);
        System.out.println("Case Status: " + this.caseStatus);
        System.out.println();
    }
}
