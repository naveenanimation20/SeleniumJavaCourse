package JavaSessions;

public class IfElse {

	public static void main(String[] args) {

		// > < >= <= == != conditional operators
		
		int a = 30;
		int b = 20;
		
		if(b>a){
			System.out.println("b is greather than a");
		}
		else{
			System.out.println("a is greater than b");
		}
		
		
		int c = 10;
		
		if(c==10){
			System.out.println("pass");
		}
		else{
			System.out.println("Fail");
		}
		
		
		int p = 5;
		int q = 20;
		int z = p+q;
		
		if(z >= 30){
			System.out.println("Passed");
		}
		else{
			System.out.println("Failed");
		}
		
		
		if(true){
			System.out.println("Passed the conditon");
		}
		//dead code:
//		else{
//			System.out.println("Failed");
//		}
		
		
	}

}
