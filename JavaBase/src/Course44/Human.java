package Course44;

public class Human extends Creatures {
	//変数
	private String Name;
	private String Hobby;

	//メソッド
	void disp() {
		System.out.println("私の名前は" + this.Name + "です");
		System.out.println("私の趣味は" + this.Hobby + "です");
	}

	void dispWeight() {
		System.out.println("体重は" + super.getWeight() + "ｇです");

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getHobby() {
		return Hobby;
	}

	public void setHobby(String hobby) {
		Hobby = hobby;
	}

}
