package Course19;

public class Plactice04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//応用問題①
		int[] logicArray = new int[5];
		logicArray[0] = 100;
		logicArray[1] = 50;
		logicArray[2] = 75;
		logicArray[3] = 80;
		logicArray[4] = 65;
		int savepoint = 0;
		for (int i = 0; i < 4; i++) {
			if (logicArray[i] > logicArray[i + 1]) {
				savepoint = logicArray[i];
				logicArray[i] = logicArray[i + 1];
				logicArray[i + 1] = savepoint;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (logicArray[i] > logicArray[i + 1]) {
				savepoint = logicArray[i];
				logicArray[i] = logicArray[i + 1];
				logicArray[i + 1] = savepoint;
			}
		}
		for (int i = 0; i < 2; i++) {
			if (logicArray[i] > logicArray[i + 1]) {
				savepoint = logicArray[i];
				logicArray[i] = logicArray[i + 1];
				logicArray[i + 1] = savepoint;
					
			}
				}
		for (int i = 0; i < 1; i++) {
			if (logicArray[i] > logicArray[i + 1]) {
				savepoint = logicArray[i];
				logicArray[i] = logicArray[i + 1];
				logicArray[i + 1] = savepoint;
			}
		}
				//中身確認用
				for (int i = 0; i < 5; i++) {
				System.out.println(logicArray[i]);
				}
		
		}

	
}
		

