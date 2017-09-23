package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {

		
		String s = "The rains have started here";
		String s1 = "The rains Have started here";

		System.out.println(s.length());
		
		System.out.println(s.charAt(5));
		
		System.out.println(s.indexOf('s')); //1st occurrence of s
		
		System.out.println(s.indexOf('s', 9)); //2nd occurrence of s
		
		System.out.println(s.indexOf("have"));
		
		System.out.println(s.indexOf("hello"));
		
		System.out.println(s.equals(s1));
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println(s.toUpperCase());
		
		//sub string:
		System.out.println(s.substring(0, 9));
		
		//trim:
		String t = "     Hello World    ";
		
		System.out.println(t.trim());
		
		//replace:
		String u = "Hello world";
		System.out.println(u.replace(" ", "-"));
		System.out.println(t.replace(" ", ""));
		
		String d = "01-01-1990";
		System.out.println(d.replace("-", "/"));
		
		
		
		
	}

}
