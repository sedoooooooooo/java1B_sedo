package Course21;

import java.util.Scanner;

public class ArrQuestion {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] typhoon = new int[12];
		int[] quake = new int[12];
		int[] rain = new int[12];
		typhoon[0] = 1;
		typhoon[1] = 1;
		typhoon[2] = 0;
		typhoon[3] = 0;
		typhoon[4] = 0;
		typhoon[5] = 1;
		typhoon[6] = 4;
		typhoon[7] = 5;
		typhoon[8] = 6;
		typhoon[9] = 4;
		typhoon[10] = 6;
		typhoon[11] = 1;

		quake[0] = 153;
		quake[1] = 127;
		quake[2] = 130;
		quake[3] = 109;
		quake[4] = 118;
		quake[5] = 164;
		quake[6] = 130;
		quake[7] = 103;
		quake[8] = 103;
		quake[9] = 104;
		quake[10] = 123;
		quake[11] = 141;

		rain[0] = 20;
		rain[1] = 58;
		rain[2] = 107;
		rain[3] = 87;
		rain[4] = 114;
		rain[5] = 187;
		rain[6] = 200;
		rain[7] = 59;
		rain[8] = 169;
		rain[9] = 441;
		rain[10] = 158;
		rain[11] = 94;

		Scanner stdIn = new Scanner(System.in);

		System.out.println("見たい情報を選んでください。");
		System.out.println("1.台風件数 2.地震件数 3.降水量");
		int menu0 = stdIn.nextInt();

		System.out.println("月別か年別かを選んでください。");
		System.out.println("1.年別 2.月別");
		int menu1 = stdIn.nextInt();

		if (menu0 == 1) {
			if (menu1 == 2) {
				int sum = 0;
				for (int i = 0; i < typhoon.length; i++) {
					sum = sum + typhoon[i];
				}
				System.out.println("1年間の台風の総合計は" + sum + "件です");
			} else {

				System.out.println("見たい月を入力してください。");
				int menu2 = stdIn.nextInt();
				System.out.println(menu2 + "月の台風件数は" + typhoon[menu2 - 1] + "です。");

				if (menu0 == 2) {
					if (menu1 == 1) {
					}

				}
			}
		}
	}
}