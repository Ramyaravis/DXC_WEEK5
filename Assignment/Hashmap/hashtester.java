package Hashmap;


	import java.util.*;

	public class hashtester {
		public static List<String> sortSales(Map<String, Integer> sales) {
	        List<Map.Entry<String, Integer>> list = new ArrayList<>(sales.entrySet());
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
	            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
	                return o2.getValue().compareTo(o1.getValue());
	            }
	        });
	        List<String> result = new ArrayList<>();
	        for (Map.Entry<String, Integer> entry : list) {
	            result.add(entry.getKey());
	        }
	        return result;
	    }


		public static void main(String args[]) {
		    Map<String, Integer> sales = new HashMap<String, Integer>();
			sales.put("Mathew", 50);
			sales.put("Lisa", 76);
			sales.put("Courtney", 45);
			sales.put("David", 49);
			sales.put("Paul", 49);

			List<String> employees = sortSales(sales);

			System.out.println("Employees in the decreasing order of their sales\n=================================================");
			for (String employeeName : employees) {
				System.out.println(employeeName);
			}

	        Map<String, Integer> sales2 = new HashMap<String, Integer>();
	        sales2.put("Mathew", 40);
	        sales2.put("Lisa", 60);
	        sales2.put("Courtney", 35);
	        sales2.put("David", 52);
	        sales2.put("Paul", 58);

			List<String> employees2 = sortSales(sales2);

			System.out.println("\nEmployees in the decreasing order of their sales 2\n==================================================");
			for (String employeeName : employees2) {
				System.out.println(employeeName);
			}
		}

	}

