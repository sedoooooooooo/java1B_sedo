package course53;

public class Book {
	private String title;
	private int price;

	//
	public Book() {
		System.out.println("動いたよ。");

	}

	public Book(String userInputTitle) {
		this.title = userInputTitle;
		System.out.println("タイトルに初期値として" + userInputTitle + "をセットしました。");
	}
    //コンストラクタ
	public Book(String userInputTitle, int userInputprice) {
                     //引数↓
		this.price = userInputprice;
		this.title = userInputTitle;

		System.out.println();
	}

	//ここにタイトルと価格をセットするコンストラクタを書いてみよう////

	//////////////////////////////////////////////////////////////////

	////////////////以下getter及びsetter(今日は無視してOK）/////////////
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	////////////////以下getter及びsetter(今日は無視してOK）/////////////
}
