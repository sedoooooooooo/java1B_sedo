package Course39;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Student[] myfriend = new Student[2];
		Student st1 = new Student();
		Student st2 = new Student();

		st1.name = "杉本侑星";
		st1.no = 13;
		st2.name = "立川";
		st2.no = 16;

		//↓格納
		myfriend[0] = st1;
		myfriend[1] = st2;

		for (int a = 0; a < 2; a++) {
			System.out.println(myfriend[a].name);
		}

	}

}
