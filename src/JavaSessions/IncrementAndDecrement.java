package JavaSessions;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		
		int i = 1;
		int j = i++; //post increment
		
		System.out.println(i);//2
		System.out.println(j);//1
		
		int m = 1;
		int n = ++m; //pre increment
		
		System.out.println(m);//2
		System.out.println(n); //2
				
		
		int p = 2;
		int q = p--; //post decrement
		
		System.out.println(p);//1
		System.out.println(q);//2
		
		int x = 2;
		int y = --x; //pre decrement
		
		System.out.println(x);//1
		System.out.println(y);//1
		
		
		int g = -1;
		int h = g++;
		System.out.println(g);//0
		System.out.println(h);//-1
		
		
		int k = -5;
		int l = k--;
		System.out.println(k);//-6
		System.out.println(l);//-5
		
		
		int c = -5;
		int d = --c;
		System.out.println(c);//-6
		System.out.println(d);//-6
		
		
		
	}

}
