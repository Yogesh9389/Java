import java.util.Scanner;
class PinGenerate
{
	int[] yourPin(int i1[], int i2[], int i3[])
	{
		int pin[];
		pin = new int[4];
		
		int i;
		int max = -1000;
		for(i=0; i<3; i++)
		{
			if(i1[i]> i2[i] && i1[i] > i3[i])
			{
				if(i1[i]>max)
				{
					max =i1[i];
				}
			}
			if(i2[i]> i1[i] && i2[i] > i3[i])
			{
				if(i2[i]>max)
				{
					max =i2[i];
				}
			}
			else
			{
				if(i3[i]>max)
				{
					max =i3[i];
				}
			}
		}
		
		pin[0] = max;
		
		for(i=0; i<3; i++)
		{
			if(i1[i]< i2[i] && i1[i]< i3[i])
			{
				pin[i+1] = i1[i];
			}
			else if(i2[i]< i1[i] && i2[i]< i3[i])
			{
				pin[i+1] = i2[i];
			}
			else
			{
				pin[i+1] = i3[i];
			}
		}
		return pin;
	}
}
class Test
{
	public static void main(String[] args)
	{
		int i1[];
		i1 = new int[3];
		int i2[];
		i2 = new int[3];
		int i3[];
		i3 = new int[3];
		int pin[];
		pin = new int[4];
		Scanner sc = new Scanner(System.in);
		int i;
		for(i=0; i<3; i++)
		{
			i1[i] = sc.nextInt();
		}
		for(i=0; i<3; i++)
		{
			i2[i] = sc.nextInt();
			
		}
		for(i=0; i<3; i++)
		{
			i3[i] = sc.nextInt();
		}
		PinGenerate ob = new PinGenerate();
		pin = ob.yourPin(i1, i2, i3);
		System.out.print("Your Unique PIN is " );
		for(i=0; i<4; i++)
		{
			System.out.print(pin[i]);
		}
		
	}
}