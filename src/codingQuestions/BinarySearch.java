package codingQuestions;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int search_ele=80;;
		int l=0;int h=a.length-1;boolean flag=false;
		while(l<=h)
		{
			int m=l+h/2;
		if(a[m]==search_ele)	
		{
			System.out.println("search_ele is found");
			flag=true;
			break;
		}
		if(a[m]>search_ele)
		{
			h=m-1;
		}
		if(a[m]<search_ele)
		{
			l=m+1;
		}
		}
		if(flag==false)
		{
			System.out.println("search_ele is not found");	
		}

	}

}
