package Course25;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//変数「ｚ」で戻り値を受け取る。
		int z = modoSample(30, 50);
		System.out.println("３０と５０の合計値は" + z + "です。");
	}

	static int modoSample(int x, int y) {
		int sum = x + y;
		return sum;
	}
}
