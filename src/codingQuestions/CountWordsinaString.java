package codingQuestions;

public class CountWordsinaString {

	public static void main(String[] args) {
		String a="supraja are you";
		int count=1;
		for(int i=0;i<a.length();i++)
		{
			if((a.charAt(i)==' ') && (a.charAt(i+1)!=' '))
			{
			count++;
			}
		}

		System.out.println(count);

	}

}
