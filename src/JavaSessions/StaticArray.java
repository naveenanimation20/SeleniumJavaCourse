package JavaSessions;

public class StaticArray {

	public static void main(String args[]) {

		//limitations of array:
		//1. size is fixed: static array : to overcome this problem, we use dynamic array or ArrayList
		//2. stores similar types of values: to overcome this problem, we use dynamic array or Object array
		
	//1. int:
		int i[] = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[1]);
		System.out.println(i[0]+i[1]);
		System.out.println(i.length); //size of array
		
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
		
		//to print all the values of array: use for loop:
		for(int k = 0; k<i.length; k++){
			System.out.println(i[k]);
		}
		
		
	//2. double:
		double d[] = new double[2];
		d[0]=12.33;
		d[1]=12.44;
		
		System.out.println(d[0]+d[1]);
		
	//3. char:
		char c[] = new char[2];
		c[0]='a';
		c[1]='$';
		
	//4. boolean:
		boolean b[] = new boolean[2];
	
	//String:
		String []s = new String[2];
		s[0]="Hello";
		s[1]="World";
		
		System.out.println(s[0]+s[1]);
		
	//Object Array:
		Object ob[] = new Object[5];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]='M';
		ob[3]="London";
		ob[4]=12.33;
		
	}

}
