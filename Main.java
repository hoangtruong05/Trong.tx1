package Cau1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		Scanner sc = new Scanner(System.in);
		int choice;
		manager.fakeData();

		do {
			System.out.println("\n===== MENU QUẢN LÝ SINH VIÊN =====");
			System.out.println("1. Nhập sinh viên chính quy");
			System.out.println("2. Nhập sinh viên vừa học vừa làm");
			System.out.println("3. In danh sách sinh viên");
			System.out.println("4. Tìm sinh viên theo tên");
			System.out.println("5. Sắp xếp theo GPA giảm dần (Regular)");
			System.out.println("6. Thoát");
			System.out.print("Chọn: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1 -> manager.addStudent(new RegularStudent());
			case 2 -> manager.addStudent(new PartTimeStudent());
			case 3 -> manager.printAll();
			case 4 -> {
				System.out.print("Nhập tên cần tìm: ");
				String key = sc.nextLine();
				manager.findByName(key);
			}
			case 5 -> manager.sortByGpa();
			case 6 -> System.out.println("Kết thúc chương trình.");
			default -> System.out.println("❌ Lựa chọn không hợp lệ!");
			}
		} while (choice != 6);
	}
}
