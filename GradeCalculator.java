package mahaboob.com23Roughwork1InternshipCodeWay;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of subjects: ");
		int numSubjects = scanner.nextInt();

		int[] marks = new int[numSubjects];
		int totalMarks = 0;

		for (int i = 0; i < numSubjects; i++) {
			System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
			marks[i] = scanner.nextInt();
			totalMarks += marks[i];
		}

		double averagePercentage = (double) totalMarks / numSubjects;
		char grade = calculateGrade(averagePercentage);

		System.out.println("\nResults:");
		System.out.println("Total Marks: " + totalMarks);
		System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
		System.out.println("Grade: " + grade);

		scanner.close();
	}

	public static char calculateGrade(double averagePercentage) {
		if (averagePercentage >= 90) {
			return 'A';
		} else if (averagePercentage >= 80) {
			return 'B';
		} else if (averagePercentage >= 70) {
			return 'C';
		} else if (averagePercentage >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
}
