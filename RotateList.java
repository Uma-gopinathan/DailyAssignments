package DailyAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst1=new ArrayList<String>(Arrays.asList("one","two","three","four","five","six"));
      Collections.rotate(lst1, -3);
      System.out.println(lst1);
	}

}
