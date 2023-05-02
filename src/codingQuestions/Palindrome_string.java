package codingQuestions;

public class Palindrome_string 
{
	public static void main(String[] args)
	{
		String a="aja";
		String rev="";
		System.out.println(a.length());
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
			//System.out.println(rev);
		}
		System.out.println(rev);
		
		if(rev.equals(a))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
	}
}
