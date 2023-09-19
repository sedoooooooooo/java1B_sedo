package Course26;

import java.util.Random;

public class Plactice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1～13までのランダムメソッド
		int a=random();
		//戦績管理メソッド
		dispResult(1,2,3);
		//aで受け取る
		int b =0;
	}

	static int random() {
		Random rnd = new Random();
		int num1 = rnd.nextInt(13)+1;

		int sum = num1;

		return sum;
	}
	static void dispResult(int x,int y,int z) {

		
		//行ったゲーム数
		System.out.println("ゲーム数は"+x);
		//勝利数
		System.out.println("勝利数は"+y);
		//敗北数
		System.out.println("敗北数は"+z);
	

	}
}
