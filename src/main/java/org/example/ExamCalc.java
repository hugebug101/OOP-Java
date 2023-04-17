package org.example;

import java.util.*;

public class ExamCalc {
    static Scanner input = new Scanner(System.in);
    static int num_student;
    static String[] student_name = new String[100];
    static int[] marks;
    static int minCount = 0;
    static int maxCount = 0;

    public static void main(String[] args) {
        System.out.println("*******************************************************\nMARKS EXAM CALCULATOR\n*******************************************************");
        System.out.print("Enter number of students: ");
        num_student = input.nextInt();
        marks = new int[num_student];
        StudentDetails();
        MarkSummary(SpecificMark());
    }

    static void StudentDetails() {
        for (int i = 0; i < num_student; i++) {
            System.out.print("Enter name: ");
            student_name[i] = input.next();
            System.out.print("Enter rounded marks: ");
            marks[i] = input.nextInt();
            System.out.println();
        }
    }

    static int SpecificMark() {
        System.out.print("\nSearch for specific marks: ");
        return input.nextInt();
    }

    static void MarkSummary(int marks) {
        System.out.println("MARK SUMMARY\n\n");
        System.out.println("\nStudent/s who get " + marks + " marks are");
        MarkSearch(marks);

        //find the highest marks
        System.out.println("\nStudents who get the highest marks " + MaxNumber() + " are");
        //find total highest marks
        System.out.println("\nTotal student/s who get the highest marks = " + maxCount);


        //find the lowest marks
        System.out.println("\nStudents who get the lowest marks " + MinNumber() + " are");
        //find total lowest marks
        System.out.println("\nTotal student/s who get the lowest marks = " + minCount);

    }

    static void MarkSearch(int find_marks) {
        int k = 0;
        for (int i = 0; i < num_student; i++) {
            if (marks[i] == find_marks) {
                System.out.println(++k + ". Name " + student_name[i] + " Index location " + i);
            }
        }
    }

    static int MaxNumber() {
        int max = marks[0];

        for (int mark : marks) {
            if (mark > max)
                max = mark;
        }
        //check how many highest marks
        for (int mark : marks) {
            if (mark == max)
                maxCount++;
        }
        return max;
    }

    static int MinNumber() {
        int min = marks[0];
        //check how many lowest marks
        for (int mark : marks) {
            if (mark == min)
                minCount++;
        }
        //find the lowest marks
        for (int j : marks) {
            System.out.println(j);
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}

