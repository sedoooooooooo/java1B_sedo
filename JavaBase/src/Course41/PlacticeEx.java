package Course41;

public class PlacticeEx {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Ex
int[]numExArr= {10,20,30,40};
int sum=0;
for (int i = 0; i < 4; i++) {
	if (numExArr[i] > numExArr[i + 1]) {
		sum = numExArr[i];
		numExArr[i] = numExArr[i + 1];
		numExArr[i + 1] = sum;
	}
}
for (int i = 0; i < 3; i++) {
	if (numExArr[i] > numExArr[i + 1]) {
		sum = numExArr[i];
		numExArr[i] = numExArr[i + 1];
		numExArr[i + 1] = sum;
	}
}
for (int i = 0; i < 2; i++) {
	if (numExArr[i] > numExArr[i + 1]) {
		sum = numExArr[i];
		numExArr[i] = numExArr[i + 1];
		numExArr[i + 1] = sum;
			
	}
		}
for (int i = 0; i < 1; i++) {
	if (numExArr[i] > numExArr[i + 1]) {
		sum = numExArr[i];
		numExArr[i] = numExArr[i + 1];
		numExArr[i + 1] = sum;
	}


	}

	}
}
