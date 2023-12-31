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

	public static Student[] listStudentsByCourse(Student[] studentList, String CourseID) {
		int count = 0;
		for (Student student : studentList) {
			if (student != null && student.getCourseID().startsWith(CourseID)) {
				count++;
			}
		}
		Student[] studentsByCourseIDArray = new Student[count];
		int index = 0;
		for (Student student : studentList) {
			if (student != null && student.getCourseID().startsWith(CourseID)) {
				studentsByCourseIDArray[index++] = student;
			}
		}
		return studentsByCourseIDArray;
	}
}