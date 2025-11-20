package day11;

public class DemoThread1 {

	public static void main(String[] args) {
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
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
		});
		
		t3.start();
		Runnable r =() -> {
			for(int i=0; i<5;i++)
			{
				System.out.println(Thread.currentThread().getName() + " " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		

		Thread t4 = new Thread(r);
		t4.start();
	}

}
