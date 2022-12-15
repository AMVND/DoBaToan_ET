package problem02;

import java.util.Scanner;

public class magazine extends document{
	private String name;
	private int number, month;
	
	Scanner scanner = new Scanner(System.in);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public magazine() {
		super();
	}
	public magazine(String name, int number, int month) {
		super();
		this.name = name;
		this.number = number;
		this.month = month;
	}
	@Override
	public String toString() {
		return "magazine [name=" + name + ", number=" + number + ", month=" + month + "]";
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("Nhap ten tap chi: ");
		name = scanner.nextLine();
		System.out.println("Nhap so phat hanh: ");
		number = scanner.nextInt();
		System.out.println("Nhap thang phat hanh: ");
		month = scanner.nextInt();
	}
}
