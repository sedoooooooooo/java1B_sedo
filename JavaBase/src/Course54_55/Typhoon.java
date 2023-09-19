package Course54_55;

public class Typhoon {
	private int typhoonbango;
	private String hasseibi;
	private String asiaName;
	//デフォルトコンストラクタ
	//引数有りコンストラクタ
	//getter,setter

	public Typhoon() {
		System.out.println("コンストラクタが動いたよ。");
	}

	public Typhoon(int tyhoonbango, String hasseibi, String asiaName) {
		this.typhoonbango = typhoonbango;
		this.hasseibi = hasseibi;
		this.asiaName = asiaName;

	}

	public int gettyphoonbango() {
		return typhoonbango;
	}

	public void settyphoonbango(int typhoonbango) {
		this.typhoonbango = typhoonbango;
	}

	public String gethasseibi() {
		return hasseibi;
	}

	public void sethasseibi(String hasseibi) {
		this.hasseibi = hasseibi;
	}

	public String getasiaName() {
		return asiaName;
	}

	public void setasiaName(String asiaName) {
		this.asiaName = asiaName;

	}
}
