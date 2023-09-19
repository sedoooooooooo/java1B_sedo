package Course47;

public class Plactice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
		//練習問題①
		try {
			int[] array = { 1, 2, 3 };
			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (Exception e) {
			System.out.println("エラー");
			//↓これをつける
			System.out.println(e);

		}
	}
}
