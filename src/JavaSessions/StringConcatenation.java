package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y); //300HelloWorld 
		System.out.println(x+y+a+b); //HellowWorld100200
		System.out.println(x+y+(a+b));
		
	}

}
