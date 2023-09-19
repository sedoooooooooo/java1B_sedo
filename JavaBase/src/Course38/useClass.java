package Course38;

import java.util.Scanner;

public class useClass {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// TODO 自動生成されたメソッド・スタブ
		Pocketon poke1 = new Pocketon();
		Pocketon poke2 = new Pocketon();
		Pocketon poke3 = new Pocketon();

		//値をセット
		poke1.name = "銭カメ";
		poke1.power = 100;
		poke1.difficult = 1;
		poke2.name = "不思議リーフ";
		poke2.power = 200;
		poke2.difficult = 3;

		//↓配列
		String arr2[] = new String[3];
		int[] testArr = new int[3];
		Pocketon[] myPockes = new Pocketon[3];

		//↓格納
		testArr[0] = 3;
		myPockes[0] = poke1;
		myPockes[1] = poke2;

		arr2[0] = "あ";
		arr2[1] = "か";
		arr2[2] = "さ";

		for (int a = 0; a < 3; a++)
			System.out.println(arr2[a]);

		//中身を表示
		poke1.display();
		{
			System.out.println(myPockes[0].name);
			System.out.println(myPockes[1].difficult);
		}

		poke3.name = stdIn.next();
		poke3.power = stdIn.nextInt();
		poke3.difficult = stdIn.nextInt();

		myPockes[2] = poke3;

		System.out.println(myPockes[2].name);
		System.out.println(myPockes[2].power);
		System.out.println(myPockes[2].difficult);

		for (int i = 0; i < 3; i++) {
			System.out.println(myPockes[i].name);

		}
		myPockes[1].display();

	}

}
