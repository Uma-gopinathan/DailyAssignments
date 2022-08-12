package DailyAssignments;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class MostDuplicateCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(mostDuplicate("abbaba"));
		String var1=mostDuplicate(" "); //sending space
		System.out.println("/"+var1+"/");
	}
	public static String mostDuplicate(String input) {

		// write your code here
		char[] ch1=input.toCharArray();
		int length = ch1.length;
		String var="";
		Map<Character,Integer> map1=new HashMap<Character,Integer>();
		for(int i=0;i<length;i++){
			map1.put(ch1[i], map1.getOrDefault(ch1[i], 0)+1); 

		}
		int maxValueInMap=Collections.max(map1.values());
		for(Map.Entry<Character,Integer> entry1: map1.entrySet()){
			if(entry1.getValue()==maxValueInMap){
				var=var+entry1.getKey();
			}
		}		
		return var;
	}
}




