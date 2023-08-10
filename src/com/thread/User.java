package com.thread;
import java.util.*;
class Details extends Thread{
	public void run() {
		Thread th=Thread.currentThread();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter username");
		String username=sc.next();
		System.out.println("Enter emailid");
		String emailid=sc.next();
		System.out.println(username);
		System.out.println(emailid);	
		
	}

	
}
class simpleinterest extends Thread{
	public void run()
    {
        double p=12000;
        int rate=3;
        int time=4;
        double si;
        si=(p*rate*time)/100;
        System.out.println("SI : "+si);
    }
}



public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Details d=new Details();
		d.start();
		simpleinterest s=new simpleinterest();
        s.start();

	}

}




  