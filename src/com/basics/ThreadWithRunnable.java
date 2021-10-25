package com.basics;

public class ThreadWithRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		ThreadWithRunnable threadRunnable = new ThreadWithRunnable();
        new Thread(threadRunnable).start();
        new Thread(threadRunnable).start();
        new Thread(threadRunnable).start();
	}

}
