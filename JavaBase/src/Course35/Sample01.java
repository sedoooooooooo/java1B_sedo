package Course35;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		calc();
		calc(50, 100);
		calc("ああ");
		calc(50);
		
	}

	static void calc() {
		System.out.println("計算をしたいときは、引数を２つ渡して");
	}

	static void calc(int a, int b) {
		System.out.println("計算結果は" + (a + b));
	}
	static void calc(String x) {
		System.out.println("渡された文字は"+x+"です");
	}
	
	static void calc(int a) {
		System.out.println("受け取った値は"+a+"です");
	}
	
	 }
		
	

