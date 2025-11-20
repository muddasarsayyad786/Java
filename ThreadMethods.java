package day11;

public class ThreadMethods {

	public static void main(String[] args) {
		Thread t1 = new Thread1();		
		t1.setName("one");
		t1.start();		
		
		Thread t2 = new Thread(new Thread2());
		t2.setName("two");
		t2.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		

		for(int i=0; i<5;i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
			
				if (i==2)
				{
					Thread.yield(); //Thread is ready to give away the cpu
				}	
			
		}
		
		try {
			t1.join(); //current thread waits for the given thread to finish
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		

	}

}
