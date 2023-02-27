package git1;

//import fileconcept.Threadcreation;



	public class Threadconcept extends Thread
	{
		public void run()
		{
			System.out.println("Im Thread running");
		}
		public static void main(String[] args) throws InterruptedException {
			Threadconcept tc=new Threadconcept();
			tc.run();
			System.out.println(tc.getState());
			Thread t1=new Thread();
			System.out.println(t1.getState());
			Thread t2=new Thread();
			System.out.println(t2.getState());
			 t2.suspend();
			   t2.yield();
			  t2.resume();
			 
		  
		   t1.currentThread();
		   System.out.println(t1.getName());
		   System.out.println(t1.getId());
		   
		   System.out.println(t2.getName());
		    System.out.println(t2.getId());
			System.out.println(t1.isAlive());
			t1.start();
			t1.run();
	   System.out.println(t2.getPriority());
	      
		}   

	}