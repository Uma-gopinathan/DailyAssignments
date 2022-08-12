package DailyAssignments;

public class ArrayLength2n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/*
		int[] nums= {2,3,4};
		int[] result=concatenate(nums);
		for(Integer num: result) {
			System.out.println(num);
		}
	}
	public static int[] concatenate(int[] nums) {

		// write your code here
		int length=nums.length;
		int k =0;
		int[] ans=new int[length*2];

		for(int i=0;i<length;i++){
			if(k<(length*2)) {
				ans[k]=nums[i];
				k=k+1;
				if(i==length-1) {
					i=-1;
				}
			}
		}			

		return ans;
	}

}
