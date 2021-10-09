package twoThreadsWithouutJoin;

public class main1 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Threadboddy());
		Thread t2 = new Thread(new Threadboddy01());
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		
	}

}
