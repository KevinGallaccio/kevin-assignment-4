package com.coderscampus;

public class StudentService {

	public static Student createStudent(String[] stringInput) {
		Student student = new Student();
		Integer studentID = Integer.parseInt(stringInput[0].trim());
		student.setStudentID(studentID);
		student.setStudentName(stringInput[1].trim());
		student.setCourseID(stringInput[2].trim());
		Integer grade = Integer.parseInt(stringInput[3].trim());
		student.setGrade(grade);
		return student;
	}

	public static Student[] listCompSciStudents(Student[] studentList) {
		int count = 0;
		for (Student student : studentList) {
			if (student != null && student.getCourseID().startsWith("COMP")) {
				count++;
			}
		}
		Student[] compSciStudentsArray = new Student[count];
		int index = 0;
		for (Student student : studentList) {
			if (student != null && student.getCourseID().startsWith("COMP")) {
				compSciStudentsArray[index++] = student;
			}
		}
		return compSciStudentsArray;
	}

	public static Student[] listAppliedMathsStudents(Student[] studentList) {
		int count = 0;
		for (Student student : studentList) {
			if (student != null && student.getCourseID().startsWith("APMT")) {
				count++;
			}
		}
		Student[] appliedMathsStudentsArray = new Student[count];
		int index = 0;
		for (Student student : studentList) {
			if (student != null && student.getCourseID().startsWith("APMT")) {
				appliedMathsStudentsArray[index++] = student;
			}
		}
		return appliedMathsStudentsArray;
	}

	public static Student[] listStatStudents(Student[] studentList) {
		int count = 0;
		for (Student student : studentList) {
			if (student != null && student.getCourseID().startsWith("STAT")) {
				count++;
			}
		}
		Student[] statStudentsArray = new Student[count];
		int index = 0;
		for (Student student : studentList) {
			if (student != null && student.getCourseID().startsWith("STAT")) {
				statStudentsArray[index++] = student;
			}
		}
		return statStudentsArray;
	}
}
