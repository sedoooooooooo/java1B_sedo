package Course19;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String a = "大関";
		String b = "長縄";
		String c = "藤倉";
		String d = "杉本";
		String e = "土屋";
		String f = "大澤";
		String g = "鹿島";
		String h = "臼井";

		//配列の鉄板構文
		//[]の事を要素と呼ぶ。要素は０から始まる。
		String[] nameList = new String[10];
		nameList[0] = "大関";
		nameList[1] = "長縄";
		nameList[2] = "藤倉";
		nameList[3] = "杉本";
		nameList[4] = "土屋";
		nameList[5] = "大澤";
		nameList[6] = "鹿島";
		nameList[7] = "臼井";

		for (int i = 0; i < 3; i++) {
			System.out.println("俺の友達の名前は" + nameList[i] + "だ。");
		}

	}

}
