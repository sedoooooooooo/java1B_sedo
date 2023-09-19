package Course17;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 13; //１０進数の１３
		int b = 013; //８新数の１３
		int c = 0x13; //１６進数の１３

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数:");
		int x = stdIn.nextInt();

		System.out.printf("10進数では%dです。\n", x);//１０進数で表示
		System.out.printf("8進数では%oです。\n", x);//8進数で表示
		System.out.printf("16進数では%xです。\n", x);//１６進数表示

	}

}
