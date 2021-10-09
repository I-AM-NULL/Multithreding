package twoThreadsWithouutJoin;

public class Threadboddy implements Runnable {

	public void run()
	{
		for(int i =1;i<=5;i++)
		{
			System.out.println(i+" First Thread");
		}
	}

}
