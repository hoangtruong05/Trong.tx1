package Cau1;

import java.util.Scanner;

public class RegularStudent extends Student {
	private String major;
	private double gpa;

	public RegularStudent() {
	}

	public RegularStudent(String id, String name, int age, String email, String major, double gpa) {
		super(id, name, age, email);
		this.major = major;
		this.gpa = gpa;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("GPA: ");
		gpa = sc.nextDouble();
		System.out.print("Chuyên ngành: ");
		major = sc.nextLine();
	}

	public static void printHeader() {
		Student.printHeader();
		System.out.printf("%-10s %-15s%n", "GPA", "Chuyên ngành");
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf(" %-10.2f %-15s%n", gpa, major);
	}

}
