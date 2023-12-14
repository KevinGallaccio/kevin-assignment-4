package com.coderscampus;

import java.io.IOException;

public class mainApplication {

	public static void main(String[] args) {
		
		try {
			Student[] knownUsers = Reader.readStudentsFromFile();
			System.out.println(knownUsers);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
