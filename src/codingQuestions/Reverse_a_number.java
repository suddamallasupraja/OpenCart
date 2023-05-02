package codingQuestions;

public class Reverse_a_number 
{
public static void main(String[] args)
{
	int num=1234;
	int rev=0;
	int r;
	while(num!=0)
	{
		r=num%10;
		rev=(rev*10)+r;
		num=num/10;
		
	}
	System.out.println("rev value:"+rev);
}
}
