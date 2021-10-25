package com.basics;

public class ThreadExample extends Thread{
	
	private static int count = 0;
	
	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName());
		synchronized(this)
		{
			System.out.println(incrementAndGet());
			try {
				Thread.sleep(1000l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public int incrementAndGet() {
		count = count+1;
		return count;
	}
	
	public static void main(String[] args) throws Exception{
		ThreadExample t1 = new ThreadExample();
		ThreadExample t2 = new ThreadExample();
		ThreadExample t3 = new ThreadExample();
		t1.start();
	//
		t1.join();
		System.out.println("t1 is started");
		t2.start();
	//	t2.join();
		System.out.println("t2 is started");
		t3.start();
	//	t3.join();
		System.out.println("t3 is started");
		
	}

}
