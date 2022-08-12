package DailyAssignments;
import java.util.Arrays;
public class SquareOfArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,6,-4,2,0};
		int[] arr3=sortedSquare(nums);
		for(Integer num: arr3) {
			System.out.println(num);
		}


	}
	public static int[] sortedSquare(int[] nums) {

		int length;
		length=nums.length;
		int[] arrOfSqr=new int[length];
		// write your code here
		for(int i=0;i<length;i++){
			arrOfSqr[i]=nums[i]*nums[i];
		}
		Arrays.sort(arrOfSqr);
		return arrOfSqr;
	}
}
