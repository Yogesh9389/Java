class Sumeven
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		int rem;
		int sum = 0; 
		while(num > 0)
		{
			rem = num%10;
			if(rem%2 == 0)
			{
				sum = sum+rem;
			}
			num = num/10;	
		}
		System.out.println("Sum of the even digits of the entered number is : " + sum);
	}
}