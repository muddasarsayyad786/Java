package day11;

public class DemoSynchro {

	public static void main(String[] args) {
//		CounterJob job = new CounterJob();
//		Thread t1 = new Thread(job);
//		Thread t2 = new Thread(job);
//		
//		t1.start();
//		t2.start();
		Counter c = new Counter();
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				synchronized (c) {
					for(int i =0 ;i<50;i++)
					{
						c.increment();
						System.out.println(c.getCount());
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}					
					}		
				}
						
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				synchronized (c) {
					for(int i =0 ; i<50; i++)
					{
						c.increment();
						System.out.println(c.getCount());
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
					}			
				}
			}
		});				
		
		t1.start();
		t2.start();


	}

}
