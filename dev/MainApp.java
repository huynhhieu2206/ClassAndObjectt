package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[10];

		// Nhập thông tin của 10 sinh viên
		input(students);

		// In ra thông tin của 10 sinh viên
		print(students);
	}

	// Phương thức nhập thông tin của 10 sinh viên
	public static void input(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
			System.out.print("Tên: ");
			String name = scanner.nextLine();
			System.out.print("Tuổi: ");
			int age = scanner.nextInt();
			scanner.nextLine(); // Đọc bỏ dòng trống
			System.out.print("Địa chỉ: ");
			String DC = scanner.nextLine();
			System.out.print("Số điện thoại: ");
			String phone = scanner.nextLine();
			System.out.print("Điểm trung bình: ");
			double DTB = scanner.nextDouble();
			scanner.nextLine(); // Đọc bỏ dòng trống

			students[i] = new Student(name, age, DC, phone, DTB);
		}
	}

	// Phương thức in ra thông tin của 10 sinh viên
	public static void print(Student[] students) {
		System.out.println("\nThông tin của danh sách 10 sinh viên:");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Sinh viên thứ " + (i + 1) + ":");
			System.out.println("Tên: " + students[i].name);
			System.out.println("Tuổi: " + students[i].age);
			System.out.println("Địa chỉ: " + students[i].DC);
			System.out.println("Số điện thoại: " + students[i].phone);
			System.out.println("Điểm trung bình: " + students[i].DTB);
			System.out.println();
		}
	}
}
