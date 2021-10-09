
public class ThreadDemo1 {
	
	
public static void main(String[] args) {
		
		System.out.println("Main thread starts ");
		
		Thread t = new Thread(new FirstThread());
		t.start();
		System.out.println("Main thread ends");
	}

}
