package Cau1;

import java.util.Scanner;

public class PartTimeStudent extends Student {
	private String job;
	private String company;

	public PartTimeStudent() {
	}

	public PartTimeStudent(String id, String name, int age, String email, String job, String company) {
		super(id, name, age, email);
		this.job = job;
		this.company = company;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Công việc: ");
		job = sc.nextLine();
		System.out.print("Công ty: ");
		company = sc.nextLine();
	}

	public static void printHeader() {
		Student.printHeader();
		System.out.printf("%-15s %-15s%n", "Công việc", "Công ty");
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("%-15s %-15s%n", job, company);
	}

}
