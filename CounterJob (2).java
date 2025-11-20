package day11;

public class CounterJob implements Runnable{

	Counter c = new Counter();

	@Override
	public void run() {
		for(int i =0 ;i<50;i++)
		{
			c.increment();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(c.getCount());
		}
		
	}
}
