package codingQuestions;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int a[]= {20,50,10,30,60};
		int b=a.length;
		for(int i=0;i<b;i++)
		{
			for(int j=0;j<b-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
//		for(int i=0;i<a.length-1;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
	}

}
