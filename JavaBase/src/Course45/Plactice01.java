package Course45;

public class Plactice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numExArr = new int[5];

		numExArr[0] = 10;
		numExArr[1] = 50;
		numExArr[2] = 30;
		numExArr[3] = 20;
		numExArr[4] = 40;

		int a = 0;
		int b = 0;
		a = numExArr[4];
		numExArr[4] = numExArr[0];

		b = numExArr[1];
		numExArr[1] = numExArr[3];
		numExArr[3] = b;

		numExArr[0] = a;

		System.out.println(numExArr[4]);
		System.out.println(numExArr[0]);
		System.out.println(numExArr[1]);
		System.out.println(numExArr[3]);
		System.out.println(numExArr[2]);

	}

}
