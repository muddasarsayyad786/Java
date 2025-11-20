package day11;

public class Counter {

	private int count;
	
	public Counter()
	{
		count =0;
	}
//	public synchronized void increment()
	public void increment()
	{
		count ++;
	}
	
//	public synchronized int getCount()
	public int getCount()
	{
		return count;
	}
}

