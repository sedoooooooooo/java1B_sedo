package Course15;

import java.util.Random;
import java.util.Scanner;

public class Pea1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//現金
		int a = 10000;
		while (a > 0 && a < 50000) {

			System.out.println("所持金" + a + "円");
			System.out.println("掛け金を入力してね");

			Scanner stdIn = new Scanner(System.in);
			int b = stdIn.nextInt();
			Random rnd = new Random();

			int num1 = rnd.nextInt(7) + 1;
			int num2 = rnd.nextInt(7) + 1;
			int num3 = rnd.nextInt(7) + 1;
			System.out.println(num1 + "." + num2 + "." + num3 + ".");

			String c = "" + num1 + num2 + num3;
			
			switch (c) {
			case "1,1,1":
				System.out.println("ピンゾロ目");
				a = a + (b * 5);
				System.out.println(a);
				break;

			case "2,2,2":
			case "3,3,3":
			case "4,4,4":
			case "5,5,5":
			case "6,6,6":
				System.out.println("ゾロ目");
				a = a + (b * 3);
				System.out.println(a);
				break;

			case "4,5,6":
				System.out.println("シゴロ");
				a = a + (b * 2);
				System.out.println(a);
				break;

			case "2.2.6":
			case "2.2.5":
			case "2.2.4":
			case "2.2.3":
			case "3.3.2":
			case "2.2.1":
				System.out.println("通常の目");
				a = (a + b);
				System.out.println(a);
				break;

			case "7.7.0":
			case "0.7.7":
			case "7.0.7":
				System.out.println("ションベン");
				a = (a - b);
				System.out.println(a);
				break;

			case "1.2.3":
				System.out.println("ヒフミ");
				a = (a - b);
				System.out.println(a);
				break;

			default:
				System.out.println("役無し");
				a = (a - b);
				System.out.println(a);
				break;
			}

		}
		if (a >= 50000) {
			System.out.println("ゲームクリア");
		} else {
			System.out.println("１０５０年地下行き");
		}
	}
}
