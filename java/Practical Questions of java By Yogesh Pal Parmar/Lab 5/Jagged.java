import java.util.Scanner;
class Jagged
{
	public int evenSum(int arr[][], int n)
	{
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			if(i%2 == 0)
			{
				for(int j=0; j<arr[i].length; j++)
				{
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println("Required sum : " + sum);
		return 0;
	}
}

class Temp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number of rows ");
		n = sc.nextInt();
		int arr[][] = new int[n][];
		System.out.println("Enter number of columns in each row");
		for(int i=0; i<n; i++)
		{
			int col = sc.nextInt();
			arr[i] = new int[col];
		}
		System.out.println("Enter elements in the array ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		
		Jagged obj = new Jagged();
		obj.evenSum(arr, n);
	}
}