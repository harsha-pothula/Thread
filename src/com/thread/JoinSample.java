package com.thread;


import java.util.Scanner;

class joinSampleThread1 extends Thread {
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter userID :");
		String userId=sc.next();
		System.out.println("Enter name : ");
		String userName=sc.next();
		System.out.println("Enter mobile number :");
		long mobilenumber=sc.nextLong();
		System.out.println("userId :" +userId+"\nuserName : "+userName+"\nmobilenumber : "+mobilenumber);	
		sc.close();
	}
}
class joinSampleThread2 extends Thread {
	public void run()
	{
		System.out.println("Hello User");
	}
}
class countThread extends Thread{
	int c=0;
	public void run()
	{
		while(joinSampleThread1.currentThread().isAlive()) {
		c+=1;
		System.out.println(c);
	}
}
}
public class JoinSample
{
	public static void main(String[] args) {
		joinSampleThread1 th=new joinSampleThread1();
		th.start();
		try {
			Thread.sleep(5000);
			th.join();
		}
		catch(InterruptedException e)
		{
		}
		joinSampleThread2 th2=new joinSampleThread2();
		th2.start();
		}
}
