package Course47;

public class Plactice03 {

	public static void main(String[] args) {

		//練習問題③
		try {
			int number2 = 5;
			if (100 / number2 == 20) {
				System.out.println("numberは5です。");
			}
		} catch (Exception e) {
			System.out.println("エラー");
			System.out.println(e);
		}

	}
}
