package Course47;

public class Plactice04 {

	public static void main(String[] args) {

		//練習問題４
		try {
			int result = divideNumbers(10, 0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("エラー");

			System.out.println(e);

		}
		///////これはmainメソッドの外に書いて////////
	}

	public static int divideNumbers(int a, int b) {
		return a / b;
	}
}
