package com.saha.amit.dto;

import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StudentDto {
	public String name;
	public int marks;
	public String id;
	
	public StudentDto(String name, int marks, String id) {
		super();
		this.name = name;
		this.marks = marks;
		this.id = id;
	}

	@Override
	public String toString() {
		return "StudentDto{" +
				"name='" + name + '\'' +
				", marks=" + marks +
				", id='" + id + '\'' +
				'}';
	}

	public  static StudentDto generateStudent() {
		Faker faker = new Faker();
	    int min = 1;
	    int max = 99;
		int marks = (int)Math.floor(Math.random() * (max - min + 1) + min);
	    int minId = 100000;
	    int maxIId = 999999;
	    String id = String.valueOf(((int)Math.floor(Math.random() * (maxIId - minId + 1) + min)));
		return new StudentDto(faker.funnyName().name(), marks, id);
	}

	public static List<StudentDto> getStudentList(int count) {
		List<StudentDto> studentDtoList = new ArrayList<>();
		Stream<Integer> s2 = Stream.iterate(1, n -> n + 1);
		s2.limit(count)
				.forEach(s -> {
							StudentDto studentDto = StudentDto.generateStudent();
							System.out.println(studentDto.toString());
							studentDtoList.add(studentDto);
						}
				);
		return studentDtoList;
	}
}
