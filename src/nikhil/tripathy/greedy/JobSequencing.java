package nikhil.tripathy.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JobSequencing {
	
	
	public static void main(String...strings) {		
		ArrayList<Job> list = new ArrayList<Job>();
		list.add(new Job('a', 2, 1000));
		list.add(new Job('b', 1, 19));
		list.add(new Job('c', 2, 27));
		list.add(new Job('d', 1, 25));
		list.add(new Job('e', 3, 15));

		Set<Character> result = jobSequence(list);
		result.stream()
			.forEach(System.out::println);
	}
	
	public static Set<Character> jobSequence(ArrayList<Job> list) {	
		
		//get the maximum deadline
		int maxDeadline = list.stream()
			.max(Comparator.comparing(Job::getDeadline))
			.get().getDeadline();
		
		boolean[] booked = new boolean[maxDeadline];
		Set<Character> result = new HashSet<Character>();
		
		
		List<Job> sortedlist = list.stream().sorted((j1, j2) ->
			Integer.compare(j2.getProfit(), j1.getProfit()))
					.collect(Collectors.toList());
		
		for (int i=0;i<sortedlist.size();i++) {
			
			for (int j=sortedlist.get(i).getDeadline()-1;j>=0;j--) {
				if (!booked[j]) {
					booked[j] = true;
					result.add(sortedlist.get(i).getId());
					break;
				}
			}
		}
		return result;
	}
}
