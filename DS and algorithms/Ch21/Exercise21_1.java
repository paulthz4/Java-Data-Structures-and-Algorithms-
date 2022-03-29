package Ch21;

/*******************************************************************************
* Exercise 21.1 pg 836
* (Perform set operations on hash sets) Create two linked hash sets {"George", *
* "Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie", "Kevin", *
* "Michelle", "Ryan"} and find their union, difference, and intersection.      *
* (You can clone the sets to preserve the original sets from being changed by  *
* these set methods.)                                                          *
*******************************************************************************/
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise21_1 {

	public static void main(String[] args) {
		Set<String> lSet1 = new LinkedHashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
		Set<String> lSet2 = new LinkedHashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
		
		Set<String> union = new LinkedHashSet<>(lSet1);
		union.addAll(lSet2);
		System.out.println("unions "+union);
		
		Set<String> difference = new LinkedHashSet<>(lSet1);
		difference.removeAll(lSet2);
		Set<String> temp = new HashSet<>(lSet2);
		temp.removeAll(lSet1);
		difference.addAll(temp);
		System.out.println("Difference "+difference);
		
		Set<String> intersection = new LinkedHashSet<>(union);
		intersection.removeAll(difference);
		System.out.println("Intersection "+intersection);
		
		//intersection alternative
//		Set<String> similar = new LinkedHashSet<>();
//		for(String e: lSet1) {
//			if(lSet2.contains(e))
//				similar.add(e);
//		}
//		System.out.println("intersection: "+similar);
		
	}

}
