import java.util.Scanner;
class Searching
{
	public void searchVal(int arr[], int n)
	{
		Scanner sc = new Scanner(System.in);
		int val, pos = -1;            // Enter value to search
		val = sc.nextInt();
		int mid, f=0, l = n-1;
		for (int i=0; i<n; i++)
		{
			mid = f + (l-f)/2;
			if(arr[mid] == val)
			{
				pos = mid;
			}
			else if(arr[mid] > val)
			{
				l = mid-1;
			}
			else{
				f = mid + 1;
			}
		}
		if(pos == -1)
		System.out.println("Number not present in the array  ");
		else
		System.out.println("Number found at : " + pos);
	}
}

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, pos; 
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		Searching obj = new Searching();
		obj.searchVal(arr, n);
	}
}