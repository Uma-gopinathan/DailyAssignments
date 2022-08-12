package DailyAssignments;

//Assignment no.3
public class PalindromePhrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome(" ");
		isPalindrome("A man, a plan, a canal:Panama");
		isPalindrome("race a car");
		isPalindrome("@toot a toot!");       
	}

    //Function to check if a string is a palindrome
	public static void isPalindrome(String str) {
		int length;
		boolean boolIsAlphaNum;     
		String str1="",rev="";

		System.out.println("The original String is: "+str);
		str=str.toLowerCase();
		char[] ch2 = str.toCharArray();
		length = ch2.length;
		for(int i=0;i<length;i++) {
			boolIsAlphaNum =Character.isLetterOrDigit(ch2[i]);
			if(boolIsAlphaNum){
				str1=str1+ch2[i];
			}
		}

		char[] ch1 = str1.toCharArray();
		for(int j=ch1.length-1;j>=0;j--) {
			//storing the characters from the last index to first in the rev string
			rev=rev+ ch1[j];
		}
		System.out.println("The string with only alphanumeric values: " + str1);
		System.out.println("The string after reversal: " +str1);
		if(str1.equals(rev)) {
			System.out.println("This string is a palindrome");
		}
		else {
			System.out.println("This string is not a palindrome");
		}
		System.out.println("--------------------");
	}
}