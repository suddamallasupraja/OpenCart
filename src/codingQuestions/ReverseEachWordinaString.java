package codingQuestions;

public class ReverseEachWordinaString {

	public static void main(String[] args) {
		String a="You are beautiful";
		String b[]=a.split(" ");
		String revstring="";
		for(String c:b)
		{
			String rev="";
			for(int i=c.length()-1;i>=0;i--)
			{
				rev=rev+c.charAt(i);
			}
			revstring=revstring+rev+" ";
		}
		System.out.println(revstring);

	}

}
