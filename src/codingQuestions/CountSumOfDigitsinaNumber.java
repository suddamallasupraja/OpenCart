package codingQuestions;

public class CountSumOfDigitsinaNumber {

	public static void main(String[] args) {
		int a=1234;
		int sum=0;
		while(a!=0)
		{
			int r=a%10;
			sum=sum+r;
			a=a/10;
		}
		System.out.println(sum);

	}

}
