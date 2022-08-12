package DailyAssignments;

public class SortedMergedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {6,7,8,9,10};
		int[] arr3=mergeArrays(arr1,arr2);
		for(Integer num: arr3) {
			System.out.println(num);
		}

	}

	public static int[] mergeArrays(int[] nums1, int nums[]) {
		// write your code here
		int length,l1,l2,j=0;
		l1=nums1.length;
		l2=nums.length;
		length=l1+l2;
		int[] nums3=new int[length];

		for(int i=0;i<length;i++){
			if(i<=l1-1){
				nums3[i]=nums1[i];
			}
			else{ 
				nums3[i]=nums[j];
				j++;
			}
		}
		return nums3;

	}
	 
}


