package com.coderscampus;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class mainApplication {

	public static void main(String[] args) {

		try {
			Student[] knownUsers = Reader.readStudentsFromFile();
			Student[] compSciStudents = StudentService.listStudentsByCourse(knownUsers, "COMP");
			Student[] appliedMathsSciStudents = StudentService.listStudentsByCourse(knownUsers, "APMT");
			Student[] statStudents = StudentService.listStudentsByCourse(knownUsers, "STAT");

			// the assignment asked for figuring out how to handle null entries.
			// I looked for it and found this Comparators.nullsLast function :

			Comparator<Student> gradeComparator = Comparator.comparing(Student::getGrade, Comparator.nullsLast(Comparator.reverseOrder()));

			Arrays.sort(compSciStudents, gradeComparator);
			Arrays.sort(appliedMathsSciStudents, gradeComparator);
			Arrays.sort(statStudents, gradeComparator);

			Writer.writeStudentsToCSV(compSciStudents, "course1.csv");
			Writer.writeStudentsToCSV(appliedMathsSciStudents, "course2.csv");
			Writer.writeStudentsToCSV(statStudents, "course3.csv");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
