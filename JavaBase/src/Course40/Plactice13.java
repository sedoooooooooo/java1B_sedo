package Course40;

public class Plactice13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = { 10, 20, 30, 40, 50 };
		int num = 0;

		for (int a = 0; a < numbers.length; a++) {
			if (numbers[a] > num) {
				System.out.println(a);
			}
		}
	}
}
