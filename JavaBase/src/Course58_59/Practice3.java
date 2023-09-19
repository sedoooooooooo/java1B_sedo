package Course58_59;

public class Practice3 {
	public static void main(String[] args) {
		
		JavaMaker jm = new JavaMaker();
		String startCode = "public class HelloWorld { public static void main(String[] args){"
				+ " for(int a=0;a<10;a++){System.out.println(\"Hello\");}"
				+ ""
				+ "}}";
		jm.javaCodeStart(startCode);
	}
}