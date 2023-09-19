package Course54_55;

public class StudentControll {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Student[] mymen = new Student[2];

		Student tonari = new Student(15, "鈴木羚也");
		Student me = new Student(13, "杉本侑星");

		mymen[0] = tonari;
		mymen[1] = me;

		mymen[2]=setName[0]("藤倉");
		System.out.println(mymen[1].getName());

	}

}
