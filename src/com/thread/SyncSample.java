package com.thread;

class printNames implements Runnable{
	String[] names= {"Peter","Sam","Edgar","Mathew","Simond"};
	public void run()
	{
		synchronized(this) {
		printArray();}
	}	
	 public void printArray() 
	{ 
	 for(String s:names) 
	{ 
		 System.out.println(s);
	} 
	 }
	}
public class SyncSample{
	public static void main(String[] args)
	{
		printNames pn=new printNames();
		Thread t1=new Thread(pn);
		Thread t2=new Thread(pn);
		t1.start();
		t2.start();
	}
}
