package Setinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class TesterS {

	public static Set<student> findUnique(List<student> students) {
        Set<student> uniqueStudents = new HashSet<student>();
        Set<String> emailIds = new HashSet<String>();
        for (student student : students) {
            if (!emailIds.contains(student.getEmailId())) {
                uniqueStudents.add(student);
                emailIds.add(student.getEmailId());
            }
        }
        return uniqueStudents;
	}

	public static Set<student> findDuplicates(List<student> students) {
        
		Set<student> duplicateStudents = new HashSet<student>();
        Set<String> emailIds = new HashSet<String>();
        for (student student : students) {
            if (emailIds.contains(student.getEmailId())) {
                duplicateStudents.add(student);
            } else {
                emailIds.add(student.getEmailId());
            }
        }
        return duplicateStudents;
	}
	
	public static void main(String[] args) {
		List<student> students = new ArrayList<student>();

		students.add(new student(5004, "Wyatt", "Wyatt@example.com","Dance"));
		students.add(new student(5010, "Lucy", "Lucy@example.com","Dance"));
		students.add(new student(5550, "Aaron", "Aaron@example.com","Dance"));
		students.add(new student(5560, "Ruby", "Ruby@example.com","Dance"));
		students.add(new student(5015, "Sophie", "Sophie@example.com","Music"));
		students.add(new student(5013, "Clara", "Clara@example.com","Music"));
		students.add(new student(5010, "Lucy", "Lucy@example.com","Music"));
		students.add(new student(5011, "Ivan", "Ivan@example.com","Music"));
		students.add(new student(5550, "Aaron", "Aaron@example.com","Music"));

		Set<student> studentNominations = findUnique(students);
		System.out.println("Students who have submitted nominations");
		for(student student: studentNominations)
		    System.out.println(student);

		Set<student> duplicateStudents = findDuplicates(students);
		System.out.println("\nStudents who have submitted nominations for both the events");
		for(student student: duplicateStudents)
		    System.out.println(student);
	}
}
