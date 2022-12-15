package problem02;

import java.util.Scanner;

public class books extends document{
	private String authorname;
	private int number;
	
	Scanner scanner = new Scanner(System.in);
	
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public books(int documentcode, String publishername, String issuenumber, String authorname, int number) {
		super(documentcode, publishername, issuenumber);
		this.authorname = authorname;
		this.number = number;
	}
	public books(int documentcode, String publishername, String issuenumber) {
		super(documentcode, publishername, issuenumber);
	}
	
	
	@Override
	public String toString() {
		return "books [authorname=" + authorname + ", number=" + number + "]";
	}
	
	
}
