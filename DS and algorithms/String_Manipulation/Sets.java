package String_Manipulation;
import java.util.*;
public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"Calgary", "Edmonton", "Kelowna", "Whitehorse"};
		Set<String> set1 = new LinkedHashSet<>(Arrays.asList(arr));
		System.out.println(set1);
		
		Set<String> set2 = new TreeSet<>(Arrays.asList(arr));
		System.out.println(set2);
		
		Set<String> hashSet = new HashSet<>(Arrays.asList(arr));
		System.out.println(hashSet);
	}

}
