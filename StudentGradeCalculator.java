import java.util.Scanner;

public class StudentGradeCalculator {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the number of courses: ");
                int numCourses = scanner.nextInt();
                int totalCredits = 0;
                double totalGradePoints = 0.0;

                for (int i = 1; i <= numCourses; i++) {
                        System.out.print("Enter the credit hours for course " + i + ": ");
                        int credits = scanner.nextInt();
                        totalCredits += credits;

                        System.out.print("Enter the grade for course " + i + " (A, B, C, D, F): ");
                        String grade = scanner.next();

                        double gradePoints = 0.0;
                        switch (grade.toUpperCase()) {
                                case "A":
                                        gradePoints = 4.0;
                                        break;
                                case "B":
                                        gradePoints = 3.0;
                                        break;
                                case "C":
                                        gradePoints = 2.0;
                                        break;
                                case "D":
                                        gradePoints = 1.0;
                                        break;
                                case "F":
                                        gradePoints = 0.0;
                                        break;
                                default:
                                        System.out.println("Invalid grade entered for course " + i
                                                        + ". Defaulting to 'F'.");
                                        gradePoints = 0.0;
                        }

                        totalGradePoints += gradePoints * credits;
                }

                double GPA = totalGradePoints / totalCredits;

                System.out.println("Total Credits: " + totalCredits);
                System.out.println("Total Grade Points: " + totalGradePoints);
                System.out.println("GPA: " + GPA);
        }
}
