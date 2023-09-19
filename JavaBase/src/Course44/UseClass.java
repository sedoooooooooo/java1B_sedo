package Course44;

public class UseClass {

	public static void main(String[] args) {
		Human human = new Human();
		Animal animal=new Animal();

		//Humanクラス
		human.setName("システム太郎");
		human.setHobby("プログラミング");
		human.setWeight(6000);

		human.disp();
		human.dispWeight();

		human.eat("ハンバーガー", 1200);

		human.dispWeight();
		
		animal.setName("サイ");
		animal.setWeight(7000000);
		animal.setKari("角で相手を粉砕する。");
		animal.setJumyou(30);
		animal.death(animal.getName());
		animal.display();

	}

}
