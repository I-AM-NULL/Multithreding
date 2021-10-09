package twoThreadsWithouutJoin;

public class Threadboddy01 implements Runnable {
	
	
	public void run()
	{
		for(int i =1;i<=5;i++)
		{
			System.out.println(i+" Second Thread");
		}
	}

}
