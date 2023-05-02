package codingQuestions;

public class Reverse_a_string 
{
	public static void main(String[] args)
	{
String a="supraja";
String rev="";
System.out.println(a.length());
for(int i=6;i>=0;i--)
{
	rev=rev+a.charAt(i);
}
System.out.println(rev);
	}
}
