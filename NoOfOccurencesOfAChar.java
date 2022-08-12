package DailyAssignments;

public class NoOfOccurencesOfAChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		String str="testleaf";
		char[] charArray = str.toCharArray();
		result = occurance(charArray,'e');
		if(result!=-1) {
			System.out.println("The character 'e' appears at position: "+result);
		}
		else {
			System.out.println("The character 'e' doesnot appear in the string");
		}
	}
	public static int occurance(char[] str, char ch) {
		// write your code here
		int length=str.length;
		int occur = 0;
		boolean boolFlag=false;
		for(int i=0;i<length;i++){
			if(str[i]==ch){
				occur=i+1;
				boolFlag=true;
				break; 				
			}
		}
		if(boolFlag==true) {
			return occur;
		}
		else {
			return 0;
		}

	}
}