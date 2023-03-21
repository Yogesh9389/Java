class Calculate
{
	public static void main(String args[])
	{
		int ch;
		double Average;
		double Percentage;
		double sum = 0; 
		for (int i = 0 ; i<args.length; i++)
		{
	
			sum = sum + Double.parseDouble(args[i]);	
		}
		Average = sum/args.length;
		Percentage = sum/(args.length*100)*100;
		System.out.println("Average of marks is : " + Average);
		System.out.println("Percentage of Student is : " + Percentage);
	}
}
