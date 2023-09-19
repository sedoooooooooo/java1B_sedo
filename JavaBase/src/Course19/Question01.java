package Course19;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//慣れよう問題１
		String[] mygroup = new String[10];

		mygroup[0] = "藤倉";
		mygroup[1] = "土屋";
		mygroup[2] = "大関";

		int[] i = new int[3];
		//慣れよう問題２
		i[0] = 22;
		i[1] = 18;
		i[2] = 6;
		//慣れよう問題３
		int[] myNum = new int[10];

		myNum[0] = 10;
		myNum[1] = 50;
		myNum[2] = myNum[0] + myNum[1];

		int[] myNumScan = new int[3];
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数字を打ってね");
		myNumScan[0] = 10;
		myNumScan[1] = stdIn.nextInt();
		myNumScan[2] = myNumScan[0] + myNumScan[2];
		System.out.println(myNumScan[2]);
	}

}
