package twoThreadsWithouutJoin;

public class main1 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Threadboddy());
		Thread t2 = new Thread(new Threadboddy01());
		t1.start();
		t2.start();
		
		
	}

}
