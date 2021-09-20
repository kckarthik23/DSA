package com.java.multithreading;

import java.util.concurrent.TimeUnit;

public class MultiProcessor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1= new Thread(new LooptaskA());
		Thread t2=new Thread(new LooptaskA());
		t1.start();
		Thread.sleep(3000);
		t2.start();

	}

}
 class LooptaskA implements Runnable{
	 private static int count=0;;
	 private  int id=0;
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("id "+id+" count "+count+" i "+i);
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	LooptaskA()
	{
		
		System.out.println(count);
		this.id=++count;
		
	}
	
	
}