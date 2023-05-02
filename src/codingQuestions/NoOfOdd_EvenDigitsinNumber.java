package codingQuestions;

public class NoOfOdd_EvenDigitsinNumber {

	public static void main(String[] args) {
		int a=123456;
		int even=0,odd=0;
		while(a!=0)
		{
			int n=a%10;
			if(n%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			a=a/10;
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
