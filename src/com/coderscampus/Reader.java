package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

	public static Student[] readStudentsFromFile() throws IOException {
		Student[] studentData = new Student[100];

		try (BufferedReader fileReader = new BufferedReader(new FileReader("student-master-list.csv"));) {
			String line;

			int index = 0;

			fileReader.readLine();

			while ((line = fileReader.readLine()) != null) {
				String[] studentInfo = line.split(",");
				Student student = StudentService.createStudent(studentInfo);
				studentData[index++] = student;
			}

		}
		return studentData;
	}
}
