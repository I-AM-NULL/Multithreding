
public class ThreadDemo {
	
	
	public static void main(String[] args) {
		
		System.out.println("Main thread starts ");
		
		FirstThread t = new FirstThread();
		t.start();
		System.out.println("Main thread ends");
	}

}
