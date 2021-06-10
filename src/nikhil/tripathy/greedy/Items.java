package nikhil.tripathy.greedy;

public class Items {
	double value, weight;
	double rate;
	public Items(int value, int weight) {
		this.value = value;
		this.weight = weight;
		rate = value/weight;
	}
}
