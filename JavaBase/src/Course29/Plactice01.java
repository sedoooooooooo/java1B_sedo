package Course29;

import java.util.Scanner;

public class Plactice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Character me = new Character();
		System.out.println("プレイヤー１のパラメータを入力してね");
		Scanner stdIn = new Scanner(System.in);
		System.out.println("名前は?");
		me.name = stdIn.next();

		Character tonari = new Character();
		Scanner stdIn = new Scanner(System.in);

		System.out.println("名前は？");
		me.name = stdIn.next();

		System.out.println("HPは？");
		me.hp = stdIn.nextInt();
		System.out.println("攻撃は？");
		me.str = stdIn.nextInt();
		System.out.println("dexは？");
		me.dex = stdIn.nextInt();
		System.out.println("agiは？");
		me.agi = stdIn.nextInt();
		System.out.println("防御は？");
		me.def = stdIn.nextInt();

		me.viewStatus();

		me.battle(me, tonari);
	}
}
