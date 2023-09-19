package Course36;

public class useclass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Student st = new Student();
		Kaden ka1 = new Kaden();
		Kaden ka2 = new Kaden();
		st.setName("わたべ");
		st.setCourse("高度情報処理科");
		st.setSchool("国際理工");

		st.display();

		Student st2 = new Student();
		st2.setName("ぬまた");
		st2.setCourse("情報システム科");
		st2.setSchool("船橋情報専門学校");

		st.display();
		st2.display();

		ka1.name = "冷蔵庫";
		ka2.name = "洗濯機";
		ka1.price = 10000;

		ka1.display();
		ka2.display();

	}
}
