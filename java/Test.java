// Important byte Data-type output based question 
class Test
{
	public static void main(String args[])
 	{
		byte b = 5;
		b = (byte)(b+1); // explicet typecasting by programmer
		byte m = 3;
		m++;   // implicit typecasting by compiler
		System.out.println(b);
		System.out.println(m); 
	}
}