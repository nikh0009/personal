package nikhil.tripathy.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FractionalKnapsac {
	
	public static void main(String...args) {
		double size = 50;
		Items first = new Items(60, 10);
		Items second = new Items(100, 20);
		Items third= new Items(120, 30);
		ArrayList<Items> list = new ArrayList<Items>();
		list.add(second);
		list.add(first);
		list.add(third);
		
		findMaximumProfit(list, size);
	}
	
	public static void findMaximumProfit(ArrayList<Items> list, double size) {
		
		double totalprofit = 0;
		List<Items> sortedItems = list.stream()
		    .sorted((item1, item2) -> Double.compare(item2.rate, item1.rate))
		    .collect(Collectors.toList());
		
		for (int i=0;i<sortedItems.size();i++) {
			Items current = sortedItems.get(i);
			if (current.weight <= size) {
				totalprofit += current.value;
				size -= current.weight;
			}
			else if (current.weight > size) {
				totalprofit = (size/current.weight) * current.value + totalprofit;
				break;
			}
		}
		System.out.println(totalprofit);
	}
}
