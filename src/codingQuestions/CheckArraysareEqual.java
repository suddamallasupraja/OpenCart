package codingQuestions;

public class CheckArraysareEqual {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					//System.out.println("both are equal");
					count++;
				}
			}
			
		}
		if(count==a.length && count==b.length)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are unequal");
		}
	}

}
