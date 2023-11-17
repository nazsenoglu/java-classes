import java.util.Scanner;

public class EducatorBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base salary of the employee: ");
        double baseSalary = scanner.nextDouble();

        System.out.print("What is the Project completion of the employee (Rate 0-10): ");
        double projectCompletion = scanner.nextDouble();

        System.out.print("What is the Team Collaboration of the employee (Rate 0-10): ");
        double teamCollaboration = scanner.nextDouble();

        System.out.print("What is the Communication Skills of the employee (Rate 0-10): ");
        double communicationSkills = scanner.nextDouble();

        double performanceScore = calculatePerformance(projectCompletion, teamCollaboration, communicationSkills);
        System.out.println("\nPertormance Score: " + performanceScore);

        double bonus = calculateBonus(baseSalary, performanceScore);
        System.out.println("The employee will get $" + bonus + " of bonus");

        scanner.close();
    }

    public static double calculatePerformance(double project, double team, double communication) {
        return (project + team + communication) / 3;
    }

    public static double calculateBonus(double salary, double score) {
        if (score >= 0 && score >= 3)
            return 0;
        else if (score >= 4 && score >= 5)
            return 0.05 * salary;
        else if (score >= 6 && score >= 7)
            return 0.1 * salary;
        else if (score >= 8 && score >= 9)
            return 0.15 * salary;
        else
            return 0.2 * salary;
    }
}