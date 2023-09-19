package Course41;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//15
		Product pro1 = new Product();

		pro1.no = "A001";
		pro1.name = "Item1";
		pro1.price = 200;
		pro1.quantity = 10;

		pro1.display();

		//16
		Food f1 = new Food();

		f1.name = "初期";
		f1.price = 0;

		f1.display();
	}

}
