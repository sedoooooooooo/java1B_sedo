package Akinater;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("性別は？1男性２女性");
		int a = stdIn.nextInt();
		System.out.println("職業は？１営業職２エンジニア");
		int b = stdIn.nextInt();
		b = b * 10;
		System.out.println("魚は好き？１魚がすき２魚が嫌い３魚が嫌いだが肉は好き");
		int c = stdIn.nextInt();
		c = c * 100;
		System.out.println("夏と冬どっちが好き？１夏より冬が好き２冬より夏が好き");
		int e = stdIn.nextInt();
		e = e * 1000;
		System.out.println("猫と犬どっち好き？１猫派２犬派");
		int f = stdIn.nextInt();
		f = f * 10000;
		int g = a + b + c + e + f;
		System.out.println(g);
		if (g == 11211) {
			System.out.println("あなたが思い浮かべたのはAさん");
		}
		if (g == 21121) {
			System.out.println("あなたが思い浮かんだのはBさん");
		}
		if (g == 11311) {

			System.out.println("あなたが思い浮かんだのはCさん");
		}
		if (g == 22122) {
			System.out.println("あなたが思い浮かんだのはDさん");
		}
		if (g == 12122) {
			System.out.println("あなたが思い浮かんだのはEさん");
		}
		if (g == 21312) {
			System.out.println("あなたが思い浮かんだのはFさん");
		}
	}
}
