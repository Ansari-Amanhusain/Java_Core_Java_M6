package com.th;
class First extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My First Class ...... "+i);
			
		}
		System.out.println("System run Successfully......");
	}
}

public class ThreadDemo 
{
	public static void main(String[] args) 
	{
		First f1=new First();
		f1.setName("First Thread");
		f1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(f1);
		f1.start();
		
		System.out.println("Thread is Alive or Not.... "+f1.isAlive());
		
		for(int i=0; i<=5; i++)
		{
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My Main Class...."+i);
		}
		System.out.println("My Main Class is Completed....");
		
		
		System.out.println("System is Alive or not   : "+f1.isAlive());
		
		
		
	}

}
