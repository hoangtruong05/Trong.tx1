package Cau1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Student {
	private String id;
	private String name;
	private int age;
	private String email;

	public Student() {
	}

	public Student(String id, String name, int age, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(EMAIL_REGEX);
		this.email = pattern.matcher(email).matches() ? email : "";
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mã sinh viên: ");
		id = sc.nextLine();
		System.out.print("Họ tên: ");
		name = sc.nextLine();
		System.out.print("Tuổi: ");
		age = sc.nextInt();
		System.out.print("Email: ");
		setEmail(sc.nextLine());
	}

	public static void printHeader() {
		System.out.printf("%-10s %-20s %-10s %-20s", "Mã SV", "Họ tên", "Tuổi", "Email");
	}

	public void printInfo() {
		System.out.printf("%-10s %-20s %-10s %-20s", id, name, age, email);
	}

}
