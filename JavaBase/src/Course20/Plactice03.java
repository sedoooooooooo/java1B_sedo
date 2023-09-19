package Course20;

public class Plactice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		
		
		System.out.println(sum);
				System.out.println(i + "の中身は" + arr[i] + "です。");
		}
	}

}
