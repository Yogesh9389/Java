import java.util.Scanner;
class CyclicSum
{
	int reqSum(int n)
	{
		int i,j=0;
		int count = 0;
		int m = n;
		while(m>0)
		{
			i = m%10;
			j = j*10+i;
			m = m/10;
			
		}
		
		int temp = j;
		int rem;
		while(j>0)
		{
			temp = j;
			while(temp>0)
			{
				rem = temp%10;
				count+= rem;
				temp = temp/10;
			}
			
			j = j/10;
		}
		return count;
	}
}
class Test
{
	public static void main(String[] args)
	{
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		CyclicSum ob = new CyclicSum();
		sum = ob.reqSum(n);
		System.out.println("The Cyclic sum of " + n + " is " + sum);
	}
	
}