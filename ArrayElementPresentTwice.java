package DailyAssignments;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayElementPresentTwice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,1};
		System.out.println(ElementDistinctOrDuplicate(arr1));
		int[] arr2= {1,2,3,4};
		System.out.println(ElementDistinctOrDuplicate(arr2));
		int[] arr3= {1,1,1,3,3,4,3,2,4,2};
		System.out.println(ElementDistinctOrDuplicate(arr3));
	}

	public static boolean ElementDistinctOrDuplicate(int[] nums) {
		int length =nums.length,maxValueInMap;
		boolean boolFlag=false;
		Map<Integer,Integer> map1 = new LinkedHashMap<Integer,Integer>();
		//for loop to put values in a map from the array and store their occurrence
		for(int i=0;i<length;i++) {
			map1.put(nums[i], map1.getOrDefault(nums[i], 0)+1); 
		}
		//retrieve the element with maximum value in k,v pair
		maxValueInMap=Collections.max(map1.values());

		if(maxValueInMap>=2){  //max.appearance is 2 or more
			boolFlag = true;
		}
		else if(maxValueInMap==1) { //all elements are distinct
			boolFlag = false;
		}
		return boolFlag;		
	}

}
