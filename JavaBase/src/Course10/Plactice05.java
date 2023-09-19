package Course10;

import java.util.Scanner;

public class Plactice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();

		if (x > y) {
			System.out.println("xがデカい");
		} else {
			if (x == y) {
				System.out.println("同じー！");

			} else {
				System.out.println("yがデカい");

			}
		}
	}

}
