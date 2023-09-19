package Poke;

import java.util.Random;

public class Trainer {

	String name;
	Pocketon[] myPockes;
	int[] a;
	//変数型[]　変数名＝new 変数型[数値]；

	Trainer() {
		name = "";
		myPockes = new Pocketon[6];

		//a = new int[6];
		//変数名＝new　変数型[数値]；
	}

	void capture(Pocketon pocke) {
		Random rand = new Random();
		int counter = rand.nextInt(10) + 1;
		if(pocke.difficult < counter) {
			System.out.println("成功");
			myPockes[pocke.getted] = pocke;
			pocke.getted++;

		}

	}

	void display() {
		System.out.println(myPockes[0].name);
		System.out.println(myPockes[1].name);
		System.out.println(myPockes[2].name);
		System.out.println(myPockes[3].name);
		System.out.println(myPockes[4].name);
		System.out.println(myPockes[5].name);

	}

}
