package codingQuestions;

public class Max_MinElementinArray {

	public static void main(String[] args) 
	{
		int a[]= {70,20,30,40,60,10,80};
/*		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
		*/
		
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
