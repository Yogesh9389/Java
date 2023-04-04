import java.util.Scanner;
class Deleting
{
	public int searchVal(int arr[], int n)
	{
		Scanner sc = new Scanner(System.in);
		int val, pos = -1;            // Enter value to Delete
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
		return pos;
	}
	public int deleteVal(int arr[], int n, int pos)
	{
		if(pos == -1)
		{
			System.out.println("Number not present in the array ");
			return 0;
		}
		int arr2[] = new int[n-1];
		for(int i=0, k=0; i<n; i++)
		{
			if(i == pos)
			{
				continue;
			}
			arr2[k++] = arr[i];
		}
		
		for(int i=0; i<n-1; i++)
		{
		System.out.print(" " + arr2[i]);
		}
		return 0;
	}
}
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Deleting obj = new Deleting();
		int pos = obj.searchVal(arr, n);
		//System.out.println(pos);
		obj.deleteVal(arr, n, pos);
	}
}