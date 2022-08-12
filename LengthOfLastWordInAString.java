package DailyAssignments;

public class LengthOfLastWordInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getLengthOfLastString("Hello World");
		getLengthOfLastString("Fly me to the moon");
		getLengthOfLastString("luffy is still joyboy");

	}
	//reusable method to return the length of the last word in passed string
	public static void getLengthOfLastString(String strText) {
		String[] strArray = strText.split(" ");
		int length=strArray.length;
		char[] charArray = strArray[length-1].toCharArray();
		System.out.println("The length of the last word in the String: "+strText+" is: "+charArray.length);
	}

}
