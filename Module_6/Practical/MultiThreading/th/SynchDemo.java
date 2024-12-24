package com.th;

class Message
{
	public void display(String msg)
	{
		System.out.print(" [ "+msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" ] ");
	}
}
class Synch extends Thread
{
	String msg;
	Message m1;
	public Synch(Message m1, String msg)
	{
		this.m1=m1;
		this.msg=msg;
	}
	public void run()
	{
		synchronized (m1) 
		{
			m1.display(msg);
		}
	}
}
public class SynchDemo 
{
	public static void main(String[] args) 
	{
		Message m1=new Message();
		Synch s1=new Synch(m1,"Hi");
		Synch s2=new Synch(m1,"Hello");
		Synch s3=new Synch(m1,"How r u ? ");
		
		s1.start();
		s2.start();
		s3.start();

	}

}
