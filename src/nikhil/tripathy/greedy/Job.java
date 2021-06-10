package nikhil.tripathy.greedy;

public class Job {
	private int deadline;
	private int profit;
	private char id;
	public Job() {
		this('#',0,0);
	}
	
	public Job(char ch, int dead, int pro) {
		id = ch;
		deadline = dead;
		profit = pro;
	}
	
	public int getDeadline() {
		return deadline;
	}
	
	public int getProfit() {
		return profit;
	}
	
	public char getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Job object " + " Id " + getId() + " Deadline " + getDeadline() + " profit " + getProfit();
	}
 }
