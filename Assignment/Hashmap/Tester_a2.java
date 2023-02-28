package Hashmap;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tester_a2 {
	public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
		LinkedList<Integer> result = new LinkedList<Integer>();
	    Set<Integer> set = new HashSet<Integer>(listOne);

	    for (Integer num : listTwo) {
	        if (set.contains(num)) {
	            result.add(num);
	            set.remove(num);
	        }
	    }
	    return result;
	}

	public static void main(String arga[]){

		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(10);
		listOne.add(12);
		listOne.add(21);
		listOne.add(1);
		listOne.add(53);

		List<Integer> listTwo = new LinkedList<Integer>();
		listTwo.add(11);
		listTwo.add(21);
		listTwo.add(25);
		listTwo.add(53);
		listTwo.add(47);

		System.out.println("Linked list 1 with common elements");
		System.out.println(findCommonElements(listOne, listTwo));

		List<Integer> listThree = new LinkedList<Integer>();
		listThree.add(51);
		listThree.add(45);
		listThree.add(63);
		listThree.add(15);
		listThree.add(82);

		List<Integer> listFour = new LinkedList<Integer>();
		listFour.add(19);
		listFour.add(63);
		listFour.add(51);
		listFour.add(87);
		listFour.add(82);

		System.out.println("\nLinked list 2 with common elements");
		System.out.println(findCommonElements(listThree, listFour));
	}

}




