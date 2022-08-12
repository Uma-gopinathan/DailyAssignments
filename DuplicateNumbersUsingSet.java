package DailyAssignments;
import java.util.TreeSet;

public class DuplicateNumbersUsingSet {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {-1,4,4,5,5,1,3,9,-1};
		boolean boolAdded;
		TreeSet<Integer> tree1=new TreeSet<Integer>();
		int length=array.length,k=0;
		int[] arr2 = new int[length];
		for(int i=0;i<length;i++) {
			boolAdded=tree1.add(array[i]);
			if(boolAdded==false) {
				arr2[k]=array[i];
				k++;
			}
		}	
		
		System.out.println("The duplicates in the array: ");
		for(Integer num: arr2) {
			System.out.println(num);
		}
	}
	
}
