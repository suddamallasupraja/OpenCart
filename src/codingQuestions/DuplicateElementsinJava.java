package codingQuestions;

public class DuplicateElementsinJava 
{
public static void main(String[] args)
{
	int count=0;
	String a[]= {"appu","abbu","appa","appu"};
	System.out.println(a.length);
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				//System.out.println("duplicate element found");
				count++;
			}
		}
	}
	System.out.println(count+"duplicate elements found");
}
}
