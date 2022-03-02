package Ch21;
/*******************************************************************************
* Exercise 21.1
* (Perform set operations on hash sets) Create two linked hash sets {"George", *
* "Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie", "Kevin", *
* "Michelle", "Ryan"} and find their union, difference, and intersection.      *
* (You can clone the sets to preserve the original sets from being changed by  *
* these set methods.)                                                          *
*******************************************************************************/
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise21_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet1 = new LinkedHashSet<>(Arrays.asList("George","Jim","John","Blake","Kevin",
				"Michael"));
		Set<String> hashSet2 = new LinkedHashSet<>(Arrays.asList("George","Katie","Kevin","Michelle","Ryan"));

		//union
		Set<String> union = new LinkedHashSet<>(hashSet1);
		union.addAll(hashSet2);
		System.out.println("Union of both HashSet1"+union);
		//difference
		Set<String> s = new LinkedHashSet<>(hashSet1);
		s.removeAll(hashSet2);
		Set<String> s2 = new LinkedHashSet<>(hashSet1);
		s2.removeAll(hashSet1);
		System.out.println("Difference: "+s+s2);

		//intersection
		Set<String> similar = new LinkedHashSet<>();
		for(String e: hashSet1) {
			if(hashSet2.contains(e))
				similar.add(e);
		}
		System.out.println("intersection: "+similar);
	}

}
