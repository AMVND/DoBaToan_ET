package problem02;

import java.util.Scanner;

public class document {
	private int documentcode;
	private String publishername, issuenumber;
	
	Scanner scanner = new Scanner(System.in);

	public int getDocumentcode() {
		return documentcode;
	}

	public void setDocumentcode(int documentcode) {
		this.documentcode = documentcode;
	}

	public String getPublishername() {
		return publishername;
	}

	public void setPublishername(String publishername) {
		this.publishername = publishername;
	}

	public String getIssuenumber() {
		return issuenumber;
	}

	public void setIssuenumber(String issuenumber) {
		this.issuenumber = issuenumber;
	}

	public document(int documentcode, String publishername, String issuenumber) {
		super();
		this.documentcode = documentcode;
		documentcode = scanner.nextInt();
		this.publishername = publishername;
		publishername = scanner.nextLine();
		this.issuenumber = issuenumber;
		issuenumber = scanner.nextLine();
	}

	public document() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "document [documentcode=" + documentcode + ", publishername=" + publishername + ", issuenumber="
				+ issuenumber + "]";
	}
	
	
}
