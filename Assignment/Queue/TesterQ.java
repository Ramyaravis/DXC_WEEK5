package Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TesterQ{
	
	public static List<Deque<TesterQ>> splitQueue(Deque<patientQueue> patientsQueue) {
		
		List<Deque<TesterQ>> queuesList = new ArrayList<Deque<TesterQ>>();
		Deque<patientQueue> seniorQueue = new ArrayDeque<patientQueue>();
		Deque<patientQueue> normalQueue = new ArrayDeque<patientQueue>();
		
		for (patientQueue patient : patientsQueue) {
			if(patient.getAge() >= 60) {
				seniorQueue.add(patient);
			}
			else {
				normalQueue.add(patient);
			}
		}		
		queuesList.add(seniorQueue);
		queuesList.add(normalQueue);
		
		return queuesList;
	}
	
	public static void main(String[] args) {
		
		patientQueue patient1 = new patientQueue("Jack","Male",25);
		patientQueue patient2 = new patientQueue("Tom","Male",64);
		patientQueue patient3 = new patientQueue("Simona","Female",24);
		
		Deque<patientQueue> patientsQueue = new ArrayDeque<patientQueue>();
		patientsQueue.add(patient1);
		patientsQueue.add(patient2);
		patientsQueue.add(patient3);
		
		List<Deque<patientQueue>> queuesList = splitQueue(patientsQueue);
	
		int counter=0;
		for (Deque<patientQueue> queue : queuesList) {
			if(counter==0)
				System.out.println("Patients in the senior queue\n============================");
			else
				System.out.println("Patients in the normal queue\n============================");
			
			for (patientQueue patient : queue) {
				System.out.println("Name : "+patient.getName());
				System.out.println("Age : "+patient.getAge());
				System.out.println();
			}
			counter++;
		}	
	}
	
}

