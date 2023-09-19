package Course57;

import java.util.Random;
import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		//1-100までのランダムな数値を生成し、変数「ransu」に格納する。
		Random rnd = new Random();
		int ransu = rnd.nextInt(100) + 1;

		for (int b = 0; b < 500; b++) {

			int a = stdIn.nextInt();
			if (a == ransu) {
				System.out.println("クリア");
				System.out.println(b);
				b = b + 500;
			} else if (a < ransu) {
				System.out.println("答えはもっと大きいです");
			}else if(a > ransu) {
				System.out.println("答えはもっと小さいです");
			}
		}
	}

}
