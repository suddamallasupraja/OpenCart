package codingQuestions;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {10,30,50,80};
		int search_elm=20;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(search_elm==a[i])
			{
				System.out.println("search_elm is found");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("search_elm is not found");	
		}

	}

}
