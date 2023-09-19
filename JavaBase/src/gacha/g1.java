package gacha;

//「import java.util.」と付くものがすべて扱える
import java.util.Random;
import java.util.Scanner;

public class g1 {

	public static void main(String[] args) {
		System.out.println("回数を入力してね");
		Scanner stdIn = new Scanner(System.in);
		Random r = new Random();
		//回す回数を入力
		int a = stdIn.nextInt();
		//kaisuuは回した回数
		for (int kaisuu = 1; kaisuu <= a; kaisuu++) {
			//確率を変数cにしまう
			int c = r.nextInt(100) + 1;
			System.out.print(kaisuu + "回目のガチャ:");
			//排出率の条件分岐
			//３０１以上回す場合
			if (a >= 301) {
				if (c == 100) {
					SSR();
					//１００じゃない場合
				} else {
					//８２以下の場合
					if (c <= 82) {
						System.out.println("R");
						//100でも８２以下でもないとき
					} else {
						System.out.println("SR");
					}
				}
			} else {
				//回した回数が300の倍数の時
				if (kaisuu % 300 == 0) {
					System.out.println("ピックアップSSR");
				} else {
					//10回目は９７％の確率でSR
					if (kaisuu % 10 == 0) {
						if (c <= 97) {
							System.out.println("SR");

						} else {
							SSR();
						}
						//１０の倍数じゃないとき下の分岐
					} else {
						if (c <= 3) {
							SSR();
						} else {
							//１００から１８までの数字
							if (c >= 100 - 82) {
								System.out.println("R");
								//その他の場合
							} else {
								System.out.println("SR");
							}
						}
					}
				}
			}
		}
	}

	static void SSR() {
		//乱数を扱うための宣言
		Random r = new Random();
		int a = r.nextInt(10) + 1;
		//３以下が出たら通常SSRを排出
		if (a <= 3) {
			System.out.println("通常SSR");
			//4以上が出たら↓
		} else {
			System.out.println("ピックアップSSR");
		}
	}
}