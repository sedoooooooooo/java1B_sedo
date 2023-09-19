package Course33;

public class Kaden {

	private String name;
	private int price;
	private String category;

	public String getName() {
		return name;
	}

	//名前設定用メソッド
	public void setName(String name) {
		if (name.equals("マウス")) {
			this.name = "設定NG";
		} else {
			//そうでないなら受け取った名前を設定
			this.name = name;
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getcategory() {
		return category;
	}

	public void setcategory(String category) {
		if (category.equals("大型")) {
			this.name = name;
		} else {
			this.name = "設定NG";
		}
	}

}