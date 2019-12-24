package QL_Sinh_vien;

import java.util.ArrayList;

public class QL_sinhvien {
	private ArrayList<String> studentList = new ArrayList<String>();

	public void addStudent(String student) {
		studentList.add(student);
	}

	public void showName( ) {
		System.out.println("Danh sach sinh vien:");
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
	}

	public void removeStudent(int index) {
		studentList.remove(index);
	}
	public void removeNameStudent(String name) {
		int index = studentList.indexOf(name);
		if (index >=0)
			studentList.remove(index);
		else
			System.out.println("Khong tim thay sinh vien de xoa!");
	}
	public void modifyStudent(int index, String newStudent) {
		studentList.set(index, newStudent);
	}

	public String findStudent(String Student) {
		if (studentList.indexOf(Student) >= 0) {
			int index = studentList.indexOf(Student);
			return studentList.get(index);
		}
		return null;
	}
}
