package Cau1;

public class StudentManager {
	private Student[] students = new Student[100];
	private int n = 0;

	public void fakeData() {
		students[n++] = new RegularStudent("S01", "Nguyen An", 20, "an@gmail.com", "CNTT", 3.6);
		students[n++] = new RegularStudent("S02", "Tran Binh", 21, "binh@gmail.com", "Kinh tế", 3.2);
		students[n++] = new PartTimeStudent("S03", "Le Cuong", 25, "cuong@gmail.com", "Kỹ sư phần mềm", "FPT Software");
		students[n++] = new PartTimeStudent("S04", "Pham Dung", 24, "dung@gmail.com", "Nhân viên kế toán", "Viettel");
		System.out.println(" Đã tạo dữ liệu mẫu thành công!\n");
	}

	public void addStudent(Student s) {
		if (n < students.length) {
			s.input();
			students[n++] = s;
			System.out.println("Đã thêm sinh viên");
		} else {
			System.out.println("Danh sách đã đầy");
		}
	}

	public void printAll() {
		System.out.println("DANH SÁCH SINH VIÊN CHÍNH QUY");
		RegularStudent.printHeader();
		System.out.println("GPA         Ngành");
		for (int i = 0; i < n; i++) {
			if (students[i] instanceof RegularStudent) {
				students[i].printInfo();
			}
		}

		System.out.println("DANH SÁCH SINH VIÊN VỪA HỌC VỪA LÀM");
		PartTimeStudent.printHeader();
		System.out.println("Công việc         Công ty");
		for (int i = 0; i < n; i++) {
			if (students[i] instanceof PartTimeStudent) {
				students[i].printInfo();
			}
		}
	}

	public void findByName(String key) {
		boolean found = false;
		for (int i = 0; i < n; i++) {
			if (students[i].getName().toLowerCase().contains(key.toLowerCase())) {
				students[i].printInfo();
				found = true;
			}
		}
		if (!found) {
			System.out.println("Không tìm thấy sinh viên nào");
		}

	}

	public void sortByGpa() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (students[i] instanceof RegularStudent s1 && students[j] instanceof RegularStudent s2) {
					if (s1.getGpa() < s2.getGpa()) {
						Student temp = students[i];
						students[i] = students[j];
						students[j] = temp;
					}
				}
			}
		}
		System.out.println("đã sắp giảm sinh viên chính quy giảm dần");
	}

}
