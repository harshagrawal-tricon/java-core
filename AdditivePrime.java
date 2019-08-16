package qwerty;

import java.util.ArrayList;
import java.util.List;

public class AdditivePrime {

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 11, 12, 18, 7 };
		int sum;

		for (int i = 0; i < a.length; i++) {
			boolean bool = prime(a[i]);
			if(bool)
			{
				sum = wesum(a[i]);
				boolean flag = prime(sum);
				if(flag)
				{
					System.out.println(a[i]+", ");
				}
			}
		}
	}

	public static boolean prime(int arr)
	{
		for(int j=2;(j*j)<=arr;j++)
		{
			if(arr%j!=0)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static int wesum(int x) {
		int mysum = 0;
		while(x ==0)
		{
			int temp = x%10;
			x = x/10;
			mysum += temp;
		}
		
		return mysum;
		
	}

}
