
public class Employee {
	public static void main(String[] args) {
		String s ="Hello";
		for( int i= s.length()-1; i>=0; i--) 
		{
			
			System.out.print(s.charAt(i));
		}
		
		//System.out.println(s);
		
		System.out.println("\t"+s.charAt(0));
		
		
		
		String ss="Hello";
		
		String s3="Hello hi there r u ok";
		System.out.println(ss.equals(s));
		System.out.println(ss==s);
		System.out.println(ss==s3);
		
		System.out.println(s.substring(0, 3));
		
		String[] arr=s3.split(" ");
		int count=0;
		for(String ar:arr)
		{count++;
			System.out.print(ar);
		}
		System.out.println(count);
	}

}
