import java.util.Arrays;

public class swap {
	
	public static int[] insertx(int size, int arr[], int x, int pos)
	{
		int i;
		int newarr[] = new int[size+1];
		for(i=0;i<size+1;i++)
		{
			if(i<pos-1)
				newarr[i] = arr[i];
			else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
		}
		return newarr;
	}

	public static void main(String[] args) {
		int arr[] = {1,4,5,7,8};
		int n = arr.length;
		int pos = 3;
		int x = 50;
		
		arr = insertx(n, arr, x, pos);
		
		
		
		System.out.println("My new array is at" + Arrays.toString(arr));
				
	}

}
