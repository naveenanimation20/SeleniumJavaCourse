package JavaSessions;

public class FunctonInJava {

	public static void main(String[] args) {

		
		FunctonInJava obj = new FunctonInJava();
		
		obj.test();
		
		int p = obj.PQR();
		System.out.println(p);
		
		String t = obj.XYZ();
		System.out.println(t);
		
		
		int k = obj.div(30, 10);
		System.out.println(k);
		
		int u = obj.div(40, 10);
		System.out.println(u);
		
		String d = obj.getName("Hello World");
		System.out.println(d);
	}
	
	
	//1. no ip and no op
	//void -- does not return any value
	public void test(){ //0 param
		System.out.println("test method");
	}
	
	public void test(int a){ //1 param
		System.out.println("test method");
	}
	
	public void test(int a, int b){ //2 params
		System.out.println("test method");
	}
	
	public void test(String a, String b){ //2 params
		System.out.println("test method");
	}
	
	//method overloading: when in the same class, we have different functions with the same name but with different parameters. 
	
	
	//2. no ip but some op
	public int PQR(){
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	public String XYZ(){
		System.out.println("XYZ method");
		String s = "Selenium";
		
		return s;
	}
	
	
	
	//3. some ip and some op
	public int div(int a, int b){
		System.out.println("DIV method");
		int c = a/b;
		
		return c;
	}
	
	public String getName(String name){
		System.out.println("get name");
		return name;
	}
	
	
	

}
