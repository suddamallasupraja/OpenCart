package codingQuestions;

public class NoOfDigitsinNumber {

	public static void main(String[] args) 
	{
	    int a=1234500;
	    int count=0;
	    while(a!=0)
	    {
	    	a=a/10;
	    	count++;
	    }
	 System.out.println(count);   

	}

}
