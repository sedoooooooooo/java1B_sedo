package Course28;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Human hu1 = new Human();
		hu1.name = "坂本";
		hu1.kotoba = "ラブ＆ピース";

		hu1.hp = 50;
		hu1.neru();

		System.out.println(hu1.name);

		//Chrクラスのインタンス「numata」を生成。
		//attack def spd love mp hpに好きなパラメータを設定してみよう。
		chr numata = new chr();
		numata.attack = 250;
		numata.def = 10;
		numata.spd = 200;
		numata.love = 0;
		numata.hp = 10;
		numata.mp = 30;

		//Chrクラスのインタンス「kajima」を生成
		//パラメータを設定してみよう。
		chr kajima = new chr();
		kajima.attack = 100;
		kajima.def = 100;
		kajima.spd = 250;
		kajima.love = 10;
		kajima.hp = 10;
		kajima.mp = 30;
		
		kajima.naguru(kajima.attack,numata.def);

	}

}
