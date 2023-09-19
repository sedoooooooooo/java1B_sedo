package Course54_55;

import java.util.Scanner;

public class TyphoonControll {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		Typhoon[] typhoonList = new Typhoon[10];
		int x;

		Typhoon Ty1 = new Typhoon(1, "2022年４月８日", "マラカス");
		Typhoon Ty2 = new Typhoon(2, "2022年４月１０日", "メーギー");
		Typhoon Ty3 = new Typhoon(3, "2022年６月３０日", "チャバ");
		Typhoon Ty4 = new Typhoon(4, "2022年７月１日", "アイレー");
		Typhoon Ty5 = new Typhoon(5, "2022年7月２８日", "ソングダー");
		Typhoon Ty6 = new Typhoon(6, "2022年７月３１日", "トローセス");
		Typhoon Ty7 = new Typhoon(7, "2022年８月９日", "ムーラン");
		Typhoon Ty8 = new Typhoon(8, "2022年８月１２日", "メアリー");
		Typhoon Ty9 = new Typhoon(9, "2022年８月２２日", "マーゴン");

		typhoonList[0] = Ty1;
		typhoonList[1] = Ty2;
		typhoonList[2] = Ty3;
		typhoonList[3] = Ty4;
		typhoonList[4] = Ty5;
		typhoonList[5] = Ty6;
		typhoonList[6] = Ty7;
		typhoonList[7] = Ty8;
		typhoonList[8] = Ty9;

		do {
			System.out.println("メニューを選択してね");
			System.out.println("0.名前表示、99.編集モード");

			x = stdin.nextInt();
			if (x == 0) {
				for (int i = 0; i < 9; i++) {
					System.out.println(typhoonList[i].getasiaName());
				}
			}

		} while (x == 99);

		{

		}
	}
}