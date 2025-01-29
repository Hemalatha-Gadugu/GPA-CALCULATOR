
    import java.util.Scanner;

public class gpacalculator {
    public static void main(String[] args) {
       try( Scanner scanner = new Scanner(System.in)){

        System.out.println("Welcome to the GPA Calculator!");
        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        double totalPoints = 0.0;
        double totalCredits = 0.0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("\nCourse " + i + ":");
            System.out.print("Enter the grade (e.g., A, B, C, etc.): ");
            char grade = scanner.next().toUpperCase().charAt(0);

            System.out.print("Enter the credit hours for this course: ");
            double credits = scanner.nextDouble();

            double gradePoints = getGradePoints(grade);
            if (gradePoints == -1) {
                System.out.println("Invalid grade entered. Please restart the program.");
                return;
            }

            totalPoints += gradePoints * credits;
            totalCredits += credits;
        }

        double gpa = totalPoints / totalCredits;
        System.out.printf("\nYour GPA is: %.2f\n", gpa);

        scanner.close();
    }
}

    // Method to convert grades to grade points
    private static double getGradePoints(char grade) {
        switch (grade) {
            case 'A': return 4.0;
            case 'B': return 3.0;
            case 'C': return 2.0;
            case 'D': return 1.0;
            case 'F': return 0.0;
            default: return -1; // Invalid grade
        }
    }
}
    

