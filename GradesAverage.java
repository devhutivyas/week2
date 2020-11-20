package javaweek2.course;
import java.util.Scanner;


public class GradesAverage {
	public static void main(String[] args) {
        int numInput = 0;
        int numStudent = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");

        numStudent = Integer.parseInt(in.next());   
        int[] arrStudent = new int[numStudent];


        do {
            System.out.print("\nEnter the grade for student " + (numInput + 1) + " :");
            int grade = Integer.parseInt(in.next());   
            if (grade >= 0 && grade <= 100) {
                arrStudent[numInput] = grade;
            } else {
                System.out.print("\nThis is not valid grade.");
                continue;
            }

            numInput++;
        } while (numInput < numStudent);

       
        int sumup = 0;
        for (int index = 0; index < arrStudent.length; index++) {
        }

       
        int average = sumup / (numInput);


    }
}






