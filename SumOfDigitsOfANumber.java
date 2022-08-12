package DailyAssignments;

import java.util.Scanner;

public class SumOfDigitsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Sum of digits of a given number
		 * split the digits in the number
		 */
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer- ");  
		int number= sc.nextInt();  
		
		int quotient;
		int dividend;
		int sum=0;
		if(number<0) {
			number=number*-1;
		}
		do{
		   quotient = number%10;
		   dividend=number/10;
		   number=dividend;
		   sum=sum+quotient;
		}while(quotient!=0);
		System.out.println("The sum of digits in the number is: "+sum);
	}
}
