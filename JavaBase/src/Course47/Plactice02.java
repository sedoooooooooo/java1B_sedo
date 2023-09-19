package Course47;

public class Plactice02 {

	public static void main(String[] args) {

		//練習問題②
		try {
			int number = 5;
			if (10 / number == 2) {
				System.out.println("numberは5です。");

			}
		} catch (Exception e) {
			System.out.println("エラー");
			System.out.println(e);
		}
		System.out.println("numberは5です。");

	}
}
