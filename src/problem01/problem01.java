package problem01;

import java.util.Scanner;

public class problem01 {
	public static int soLonNhat(int myArr[], int n) {
		if (n==1) {
			return myArr[0];
		}
		return Math.max(myArr[n-1], soLonNhat(myArr, n-1));
	}
	public static void main(String[] args) {
		//số lượng phần tử mảng
		int so=0;
		System.out.println("Nhap so phan tu mang: ");
		Scanner sc = new Scanner(System.in);
		so = sc.nextInt();
		
		//nhập số
		int [] myArr = new int [so];
		for(int c=0; c<so; c++) {
			System.out.println("Nhap so thu: " + (c+1) + ": ");
			myArr[c] = sc.nextInt();
		}
		//
		int n = myArr.length;
		System.out.println("So lon nhat la: "+soLonNhat(myArr, n));
	}
}
