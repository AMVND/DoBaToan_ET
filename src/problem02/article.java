package problem02;

import java.util.Scanner;

public class article extends document {
	private String content;
	private String publicDate;
	
	Scanner scanner = new Scanner(System.in);
	
	
	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getPublicDate() {
		return publicDate;
	}


	public void setPublicDate(String publicDate) {
		this.publicDate = publicDate;
	}


	public article(int documentcode, String publishername, String issuenumber, String content, String publicDate) {
		super(documentcode, publishername, issuenumber);
		this.content = content;
		this.publicDate = publicDate;
	}


	public article(int documentcode, String publishername, String issuenumber) {
		super(documentcode, publishername, issuenumber);
	}

}
