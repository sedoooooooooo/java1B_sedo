package Course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		Player me = new Player();
		Target koku = new Target();
		Random rnd = new Random();
		int ransu = rnd.nextInt(5) + 1;
		int a = ransu;

		me.setKinryoku((rnd.nextInt(4) + 1));
		me.setGakuryoku((rnd.nextInt(4) + 1));
		me.setMitame((rnd.nextInt(4) + 1));
		me.setOmosiro((rnd.nextInt(4) + 1));

		koku.setHituyouKin((rnd.nextInt(11) + 3));
		koku.setHituyouGaku((rnd.nextInt(11) + 3));
		koku.setHituyouMita((rnd.nextInt(11) + 3));
		koku.setHituyouOmo((rnd.nextInt(11) + 3));

		for (int n = 0; n < 7; n++) {

			System.out.println("現在のパラメータ");
			System.out.println("筋力" + me.getKinryoku());
			System.out.println("学力" + me.getGakuryoku());
			System.out.println("見た目" + me.getMitame());
			System.out.println("面白さ" + me.getOmosiro());

			System.out.println("トレーニングメニューを表示します");
			System.out.println(1 + "筋トレ＝筋肉が１上昇");
			System.out.println(2 + "勉強＝学力が１上昇");
			System.out.println(3 + "整形＝見た目が１上昇");
			System.out.println(4 + "人と喋る＝面白さが１上昇");

			int x = stdin.nextInt();

			if (x == 1) {
				me.setKinryoku(me.getKinryoku() + 1);
			} else if (x == 2) {

				me.setGakuryoku(me.getGakuryoku() + 1);
			} else if (x == 3) {

				me.setMitame(me.getMitame() + 1);
			} else if (x == 4) {

				me.setOmosiro(me.getOmosiro() + 1);
			}

			int ransu2 = rnd.nextInt(4) + 1;

			if (ransu2 == 1) {
				System.out.println("筋力" + koku.getHituyouKin());
			} else if (ransu2 == 2) {
				System.out.println("学力" + koku.getHituyouGaku());
			} else if (ransu2 == 3) {
				System.out.println("見た目" + koku.getHituyouMita());
			} else if (ransu2 == 4) {
				System.out.println("面白さ" + koku.getHituyouOmo());

			}
			System.out.println("告白しようと思ってるフォロワーのみんなには悪いけど");
			System.out.println("どの能力で勝負する？");
			System.out.println("1筋トレ");
			System.out.println("2勉強");
			System.out.println("3整形");
			System.out.println("4コミュ力");
			int y = stdin.nextInt();

			if (y == 1) {

			} else if (y == 2) {

			} else if (y == 3) {

			} else if (y == 4) {

			}

		}

	}

}
