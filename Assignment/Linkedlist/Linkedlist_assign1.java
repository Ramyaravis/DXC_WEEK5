package linkedlist;


	

	import java.util.HashSet;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Set;

	public class Linkedlist_assign1 {
		public static List<Integer> removeDuplicates(List<Integer> list) {
			Set<Integer> uniqueValues = new HashSet<>();
			List<Integer> result = new LinkedList<>();
			for (Integer value : list) {
				if (uniqueValues.add(value)) { 
					result.add(value);
				}
			}
			
			return result;
		}
		
		public static void main(String args[]) {
			List<Integer> list = new LinkedList<Integer>();
			list.add(10);
			list.add(15);
			list.add(21);
			list.add(15);
			list.add(10);
			
			List<Integer> updatedList = removeDuplicates(list);
			
			System.out.println("Linked list without duplicates");
			for (Integer value : updatedList) {
				System.out.print(value+" ");
			}
			
			List<Integer> list2 = new LinkedList<Integer>();
			list2.add(51);
			list2.add(45);
			list2.add(45);
			list2.add(15);
			list2.add(82);
			list2.add(51);
			list2.add(10);
			
			List<Integer> updatedList2 = removeDuplicates(list2);
			
			System.out.println("\nLinked list2 without duplicates");
			for (Integer value : updatedList2) {
				System.out.print(value+" ");
			}
		}
	}
