package DailyAssignments;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

//Majority occurences of an element in an array-n/2 times
public class MajorityElementInAnArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,3};
		int majCount=nums.length/2,maxValueInMap,majKey = 0;

		Map<Integer,Integer> map1=new LinkedHashMap<Integer,Integer>();
		//for loop to put values in a map from the array and store their occurence
		for(int i=0;i<nums.length;i++) {
			map1.put(nums[i], map1.getOrDefault(nums[i], 0)+1); 

		}
		//retrieve the element with maximum value in k,v pair
		maxValueInMap=Collections.max(map1.values());
		for(Map.Entry<Integer,Integer> entry1: map1.entrySet()){
			if(entry1.getValue()==maxValueInMap){
				majKey=entry1.getKey();
				break;
			}
		}	
		//verify if the majority No. of occurrence is same as expected =n/2 and return the key 
		if(majCount<maxValueInMap) {
			System.out.println("The element with majority occurences(n/2) is: "+majKey+" with : "+ maxValueInMap +" occurences");
		}
		else if(majCount<=maxValueInMap) {
			System.out.println("The element: "+majKey+" appears less than n/2 no. of times in the array");
		}
	}
}

