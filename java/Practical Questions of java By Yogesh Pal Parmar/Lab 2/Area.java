import java.util.Scanner;
class Area
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		int areaRct;
		int areaSq;
		double areaTri;
		switch(ch)
		{
			case 1:
			areaRct = calculateArea(args); 
			System.out.println("Area of Rectangle is: " + areaRct);
			break;
			case 2:
			areaSq = calculateArea(args);
			System.out.println("Area of Square is: " + areaSq);
			break;
			case 3:
			areaTri = calculateArea(args);
			System.out.println("Area of Triangle is: " + areaTri);
			break;
			default:
			System.out.println("Invalid Choice :");
		}
		
	}
	public static int calculateArea(String args[])
	{	
		int area = 1;
		for(int i=0; i<args.length; i++)
		{
			area = area * Integer.parseInt(args[i]);
		}
		return area;
	}
	public static int calculateArea(int args[])
	{	
		int area = 1;
		for(int i=0; i<args.length; i++)
		{
			area = area * args[i];
			
		}
		return area;
	}
	public static double calculateArea(double args[])
	{	
		double area = 1;
		for(int i=0; i<args.length; i++)
		{
			area = area * 0.5 * args[i];
			
		}
		return area;
	}
}
