package DailyAssignments;
import java.util.ArrayList;
import java.util.Arrays;

public class arraySumSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Program to find if the target number is available as sum of any two elements in an in array
		Write your logic after the comment - write your code here
		 */
		int[] numArray= {1,2,4,5,6};
		int target =8;
		ArrayList<Integer> result=twoSum(numArray,target);
		
		System.out.println(result);
	}
	public static ArrayList<Integer> twoSum(int[] nums, int target) {
		int temp,pos;
		ArrayList<Integer> arrMatch=new ArrayList<Integer>();
		// write your code here
		for(int i=0;i<nums.length;i++){
			temp=target-nums[i];
			pos=Arrays.binarySearch(nums, temp);
			if(pos>=0){
				arrMatch.add(0, i);
				arrMatch.add(1, pos);
				break;
			}
		}
		
		return arrMatch;
	}
}
