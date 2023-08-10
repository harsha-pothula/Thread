package com.thread;


class cab
{
}
class waitcab implements Runnable {
	cab cab;
	String cabUserName;
	public waitcab(cab cab,String cabUserName)
	{
		this.cab=cab;
		this.cabUserName=cabUserName;
	}
	public void run() {
		synchronized(cab)
		{
			try {
				System.out.println("cab user is :"+this.cab);
				cab.wait();
				System.out.println("cab user changed");
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
class notifycab implements Runnable{
	cab cab;
	notifycab(cab cab)
	{
		this.cab=cab;
	}
	public void run()
	{
		synchronized(cab)
		{
		try {
			Thread.sleep(2000);
			cab.notify();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
}
public class WaitSample
{
	public static void main(String[] args)
	{
		cab cab=new cab();
		waitcab wc=new waitcab(cab,"peter");
		notifycab nc=new notifycab(cab);
		Thread th1=new Thread(wc);
		Thread th2=new Thread(nc);
		th1.start();
		th2.start();
		
		
	}
}
