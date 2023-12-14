package com.coderscampus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void writeStudentsToCSV(Student[] students, String filename) throws IOException {
		try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filename))) {
			fileWriter.write("StudentID,StudentName,CourseID,Grade\n");
			for (Student student : students) {
				if (student != null) {
					fileWriter.write(student.getStudentID() + "," + student.getStudentName() + ","
							+ student.getCourseID() + "," + student.getGrade() + "\n");
				}
			}
		}
	}

}
