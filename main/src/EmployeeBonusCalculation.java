import java.util.Scanner;

public class EmployeeBonusCalculation {

    public static double calculatePerformance(int projectCompletion, int teamCollaboration, int communicationSkills) {
        return (projectCompletion + teamCollaboration + communicationSkills) / 3.0;
    }

    public static double calculateBonus(double baseSalary, double performanceScore) {
        if (performanceScore >= 0 && performanceScore <= 3) {
            return 0;
        } else if (performanceScore >= 4 && performanceScore <= 5) {
            return baseSalary * 0.05;
        } else if (performanceScore >= 6 && performanceScore <= 7) {
            return baseSalary * 0.10;
        } else if (performanceScore >= 8 && performanceScore <= 9) {
            return baseSalary * 0.15;
        } else if (performanceScore == 10) {
            return baseSalary * 0.20;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base salary of the employee: ");
        double baseSalary = scanner.nextDouble();

        System.out.print("What is the Project completion of the employee (Rate 0-10): ");
        int projectCompletion = scanner.nextInt();

        System.out.print("What is the Team Collaboration of the employee (Rate 0-10): ");
        int teamCollaboration = scanner.nextInt();

        System.out.print("What is the Communication Skills of the employee (Rate 0-10): ");
        int communicationSkills = scanner.nextInt();

        double performanceScore = calculatePerformance(projectCompletion, teamCollaboration, communicationSkills);
        double bonus = calculateBonus(baseSalary, performanceScore);

        System.out.println("The bonus of the employee is: " + bonus);
    }
}
