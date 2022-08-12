package DailyAssignments;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;

		int[] arr1= {9,4,9,8,4};
		int[] arr2= {9,5,4};
		int[] arr3=arrayIntersection(arr1,arr2);
		for(Integer num: arr3) {
			System.out.println(num);
		}

	}

	public static int[] arrayIntersection(int[] nums1, int[] nums2) {
		int[] result=new int[3];
		int k=0,pos;
		// write your code here
		for(int i=0;i<nums1.length;i++){
			for(int j=0;j<nums2.length;j++){
				if(nums2[j]==nums1[i]){
					Arrays.sort(result);
					pos=Arrays.binarySearch(result, nums2[j]);
					if(pos<0) {
						result[k]=nums2[j];
						k=k+1;     
					}
				}
			}
		}
		return result;
	}
}
