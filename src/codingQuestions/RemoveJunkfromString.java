package codingQuestions;

public class RemoveJunkfromString {

	public static void main(String[] args) {
		String a="@#$%^&*()! testing ^&*((";
a=a.replaceAll("[^a-zA-Z0-9]","");
System.out.println(a);
	}

}
