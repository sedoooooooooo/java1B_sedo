package Course44;

public class Animal extends Creatures{
	
private String name;
private String kari;

void display() {
	System.out.println("私の名前は"+this.name+"です");
	System.out.println();
	System.out.println("私の名前は"+this.kari+"です。");
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getKari() {
	return kari;
}

public void setKari(String kari) {
	this.kari = kari;
}

}
