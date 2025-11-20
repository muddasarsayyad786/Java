package day11;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue {

	Queue<String> queue;
	boolean hasvalue = false;
	
	public MyQueue()
	{
		queue = new ArrayDeque<>(1);
	}
	
	public synchronized void setValue(String value)
	{
		if(hasvalue)
		{
			try {
				wait();
			} catch (InterruptedException e) {
						e.printStackTrace();
			}
		}
		queue.add(value);
		System.out.println("Data added in the queue " + value);
		hasvalue = true;
		notifyAll();
	}
	
	public synchronized void getValue()
	{
		if(!hasvalue)
		{
			try {
				wait();
			} catch (InterruptedException e) {
						e.printStackTrace();
			}
		}
		String value = queue.remove();
		System.out.println("Data received : "+ value);
		hasvalue = false;
		notifyAll();
	}
}
