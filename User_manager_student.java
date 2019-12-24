package QL_Sinh_vien;

import java.util.Scanner;

public class Main {
		private static QL_sinhvien studentList = new QL_sinhvien();
		private static Scanner scanner = new Scanner(System.in);
		public static void main (String[] args) {
			System.out.println("Chuong trinh quan ly sinh vien:");
			ShowIntro();
			
			boolean flag = true;
			while (flag) {
				System.out.println("Nhap lua chon cua ban:");
				int choice = scanner.nextInt();
				scanner.nextLine();
				switch(choice) {
				case 0: {
					ShowIntro();
					break;
				}
				case 1: {
					studentList.showName();
					break;
				}
				case 2: {
					addItem();
					break;
				}
				case 3: {
					modifyItem();
					break;
				}
				case 4: {
					removeItem();
					break;
				}
				case 5: {
					searchItem();
					break;
				}
				case 6: {
					flag = false;
					break;
				}
				}
			}
		}
		private static void searchItem() {
			System.out.println("Nhap ten sinh vien ban muon tim:");
			String student = scanner.nextLine();
			String find = studentList.findStudent(student);
			if (find!=null) {
				System.out.println("Tim thay sinh vien");
			}
			else
				System.out.println("Khong tim thay");
		}
		private static void removeItem() {
			System.out.println("Nhap vao so thu tu sinh vien ban muon xoa:");
			int index = scanner.nextInt();
			scanner.nextLine();
			studentList.removeStudent(index);
			
		}
		private static void modifyItem() {
			System.out.println("Nhap so thu tu sinh vien ban muon thay doi:");
			int index = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Nhap vao ten sinh vien moi:");
			String newStudent = scanner.nextLine();
			studentList.modifyStudent(index, newStudent);
		}
		private static void addItem() {
			System.out.println("Nhap thong tin sinh vien ban can them:");
			String student = scanner.nextLine();
			studentList.addStudent(student);
			
			
		}
		public static void ShowIntro() {
			System.out.println("\nPress ");
			System.out.println("\t 0 - To print choice options.");
			System.out.println("\t 1 - To print the list of student itmes.");
			System.out.println("\t 2 - To add an item to the list.");
			System.out.println("\t 3 - To modify an item in the list.");
			System.out.println("\t 4 - To remove an item frome the list.");
			System.out.println("\t 5 - To search for an item in the list.");
			System.out.println("\t 6 - To quit the application.");
		}
}
