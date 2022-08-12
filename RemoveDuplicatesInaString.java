package DailyAssignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removedup("testleaf"));

	}
	public static Set<Character> removedup (String input) {

		// write your code here
		boolean flag=false;
		char[] ch1=input.toCharArray();
		int length=ch1.length;
		Set<Character> set1=new LinkedHashSet<Character>();
		Set<Character> set2=new LinkedHashSet<Character>();  //for storing duplicates 
		for(int i=0;i<length;i++){
			flag=set1.add(ch1[i]);
			if(flag==false) {
				set2.add(ch1[i]);
				set1.remove(ch1[i]);
			}
		}
		return set1;

	}

}
