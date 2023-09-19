package Course27;

import java.util.Random;
import java.util.Scanner;

public class Mix {

	public static void main(String[] args) {

		System.out.println("ハイカード！");

		//初期所持金
		int money = 1000;
		System.out.println("現在の所持金は" + money + "です。");

		//敗北数の記録
		int losecount = 0;
		//勝利数の記録
		int wincount = 0;
		wincount = 0;
		int gamecount = 0;
		gamecount = 0;
		//所持金の表示
		//1～13までのランダムメソッド
		int my = random1();
		System.out.println(my);
		System.out.println("高いと予想するなら「1」 低いと予想するなら「2」");
		Scanner stdIn = new Scanner(System.in);
		int hr = stdIn.nextInt();
		int you = random2();
		System.out.println(you);
		String aa = syouhai(my, you, hr);

		//戦績管理メソッド
		dispResult(gamecount, wincount, losecount);
		//aで受け取る
		int b = 0;
	}

	static void syojikin(String aa, int m) {

		if (aa.equals("LOSE")) {
			m = m / 2;
			System.out.println("現在の所持金は" + m + "です。");
		} else if (aa.equals("WIN")) {
			m = m * 2;
			System.out.println("現在の所持金は" + m + "です。");
		}

	}

	static int random1() {
		Random rnd = new Random();
		int num1 = rnd.nextInt(13) + 1;
		return num1;
	}

	static int random2() {
		Random rnd = new Random();
		int num2 = rnd.nextInt(13) + 1;
		return num2;
	}

	static void dispResult(int x, int y, int z) {
		//行ったゲーム数
		System.out.println("ゲーム数は" + x);
		//勝利数
		System.out.println("勝利数は" + y);
		//敗北数
		System.out.println("敗北数は" + z);

	}

	static String syouhai(int x, int y, int z) {
		String aa = "";
		if (z == 1) {
			if (x < y) {
				aa = "WIN";
			} else {
				aa = "LOSE";
			}
		}
		if (z == 2) {
			if (x > y) {
				aa = "WIN";
			} else {
				aa = "LOSE";
			}
		}
		System.out.println(aa);
		return aa;
	}
}