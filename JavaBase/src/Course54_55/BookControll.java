package Course54_55;

import course53.Book;

public class BookControll {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Book[] hondana = new Book[4];
		Book book1 = new Book("明解Java", 1500);
		Book book2 = new Book("ITパスポート", 2500);
		Book book3 = new Book("VB", 1200);
		Book book4 = new Book("確かな力が身につく", 2800);

		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14;
		
		hondana[0]=book1;

		System.out.println(arr[3]);
		System.out.println(book1.getPrice());

	}

}
