package codingQuestions;

public class Palindrome_number 
{
public static void main(String[] args)
{
	int num=1221;
	int number=num;
	int rev=0;
	int r;
	while(num!=0)
	{
		r=num%10;
		rev=(rev*10)+r;
		num=num/10;
		System.out.println(rev);
		
	}
	System.out.println("rev value:"+rev);
	
	if(rev==number)
	{
		System.out.println("num is palindrome");
	}
	else
	{
		System.out.println("num is not palindrome");
	}
}
}
