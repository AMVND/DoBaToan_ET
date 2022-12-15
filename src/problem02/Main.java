package problem02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int option = 0;
		int option2=0;
		int option3=0;
		do {
			menu();
			option = scanner.nextInt();
		
			switch (option) {
			case 1:
				System.out.println("\n Them \n");
				submenu();
				option2 = scanner.nextInt();
				
				switch (option2) {
				case 1:
					System.out.println("\n Them books \n");
					BookManager bookManager = new BookManager();
					System.out.println("Nhap ma tai lieu: ");
					int documentcode = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhap ten nha xuat ban: ");
					String publishername = scanner.nextLine();
					System.out.println("Nhap so phat hanh: ");
					String issuenumber = scanner.nextLine();
					System.out.println("Nhap ten tac gia: ");
					String authorname = scanner.nextLine();
					System.out.println("Nhap so trang: ");
					int number = scanner.nextInt();
					bookManager.insertBooks(documentcode, publishername, issuenumber, authorname, number);
					break;

				case 2:
					System.out.println("\n Them article \n");
					ArticleManager articleManager = new ArticleManager();
					System.out.println("Nhap ma tai lieu: ");
					int documentcodea = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhap ten nha xuat ban: ");
					String publishernamea = scanner.nextLine();
					System.out.println("Nhap so phat hanh: ");
					String issuenumbera = scanner.nextLine();
					System.out.println("Nhap noi dung: ");
					String content = scanner.nextLine();
					System.out.println("Nhap ngay phat hanh: ");
					String publicDate = scanner.nextLine();
					articleManager.insertArticles(documentcodea, publishernamea, issuenumbera, content, publicDate);
					break;
					
				case 3:
					System.out.println("\n Them magazine \n");
					MagazineManager magazineManager = new MagazineManager();
					System.out.println("Nhap ma tai lieu: ");
					int documentcodeb = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhap ten nha xuat ban: ");
					String publishernameb = scanner.nextLine();
					System.out.println("Nhap so phat hanh: ");
					String issuenumberb = scanner.nextLine();

					System.out.println("Nhap ten tap chi: ");
					String name = scanner.nextLine();
					System.out.println("Nhap so phat hanh: ");
					int numbers = scanner.nextInt();
					System.out.println("Nhap thang phat hanh: ");
					int month = scanner.nextInt();
					magazineManager.insertMagazines(documentcodeb, publishernameb, issuenumberb, name, numbers, month);
					break;
					
				case 4:
					System.out.println("\n Thoat \n");
					System.exit(0);
					break;
				}
				
		
				break;
				
			case 2:
				System.out.println("\n Hien thi \n");
				submenu1();
				option3 = scanner.nextInt();
				
				switch (option3) {
				case 1:
					System.out.println("\n List books \n");
					BookManager bookManager = new BookManager();
					bookManager.show();
					break;

				case 2:
					System.out.println("\n List article \n");
					ArticleManager articleManager = new ArticleManager();
					articleManager.show();
					break;
					
				case 3:
					System.out.println("\n List magazine \n");
					MagazineManager magazineManager = new MagazineManager();
					magazineManager.show();
					break;
					
				case 4:
					System.out.println("\n Thoat \n");
					System.exit(0);
					break;
				}
				break;
			case 3:
				System.out.println("\n Tim kiem theo ma \n");
				break;
			case 4:
				System.out.println("\n Tim kiem theo ngay \n");
				break;
			case 5:
				System.out.println("\n Sap xep \n");
				break;
			case 6:
				System.out.println("\n Thoat \n");
				System.exit(0);
				break;
			
			}	
		} 
		while (option!=6);
	}

		public static void menu() {
			System.out.println("MENU");
			System.out.println("1: Them");
			System.out.println("2: Hien thi");
			System.out.println("3: Tim kiem theo ma");
			System.out.println("4: Tim kiem theo ngay");
			System.out.println("5: Sap xep");
			System.out.println("6: Thoat");
			System.out.println("Chon: ");
		}
		
		public static void submenu() {
			System.out.println("1: Them books");
			System.out.println("2: Them article");
			System.out.println("3: Them magazine");
			System.out.println("4: Thoat");
			System.out.println("Chon: ");
		}
		
		public static void submenu1() {
			System.out.println("1: Hien thi books");
			System.out.println("2: Hien thi article");
			System.out.println("3: Hien thi magazine");
			System.out.println("4: Thoat");
			System.out.println("Chon: ");
		}

}
