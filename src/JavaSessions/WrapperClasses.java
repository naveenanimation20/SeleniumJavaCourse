package JavaSessions;

public class WrapperClasses {

	public static void main(String[] args) {

		//String to int: data coversion
		String x = "100";
		System.out.println(x+20);
		
		int y = Integer.parseInt(x); //100
		System.out.println(y+20);
		
		
//		String u = "100A";
//		System.out.println(u+20); //Number Format Exception
//		
//		int s = Integer.parseInt(u);
		
		
		//String to double:
		String p = "12.33";
		System.out.println(p+20);
		
		double d1 = Double.parseDouble(p); //12.33
		System.out.println(d1+20);
		
		
		//int to String:
		int l = 20;
		System.out.println(l+20);
		
		String k = String.valueOf(l); //"20"
		System.out.println(k+20);
		
		//double to String:
		double g = 12.33;
		String h = String.valueOf(g);
		System.out.println(h+20);
		
	}

}
