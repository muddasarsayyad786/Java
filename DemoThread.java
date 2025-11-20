package day11;

public class DemoThread {

	public static void main(String[] args) {
		Thread t1 = new Thread1();		
		t1.start();
		
		Thread t2 = new Thread(new Thread2());
		t2.start();

		
		for(int i=0; i<5;i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
