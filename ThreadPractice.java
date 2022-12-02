class Thread1 extends Thread{
	void print() {
		try {
			for(int i=1;i<=3;i++) {
				System.out.println("Very Good morning ");
				Thread.sleep(1000);
				System.out.println("Most Welcome ");
			}
		}
		catch(Exception e) {
			System.out.println("Print interrupted ");
		}
		
	}
	public void run() {
		try {
			for(int i=1; i<=3; i++) {
				System.out.println("Hello I am Sonali ");
				Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			System.out.println("run interrupted ");
		}
		
		
	}
	
}

class Thread2 extends Thread{
	
	public void run() {
		try {
			for(int i=1;i<=3;i++) {
				System.out.println("Good morning ");
				Thread.sleep(200);
				System.out.println("Welcome ");
				
			}
			}
		
		catch(Exception e) {
			System.out.println("run interrupted ");
		}
		
		
	}
	
}
public class ThreadPractice {

	public static void main(String[] args) throws Exception {
		/*
		Write a program to print "Good morning" and "Welcome" continuously on the screen in Java 
		using threads.
		 */
		Thread1 t1 = new Thread1();
		t1.print();
		t1.start();
		for(int i=1; i<=3; i++) {
			System.out.println("Hii");
			Thread.sleep(1000);
		}
		System.out.println(); 
		
		
	/* Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
	Add a sleep method in the welcome thread of question 1 to delay its execution for 200ms.
	Demonstrate gerPriority() and setPriority() methods in Java threads.
	How do you get the reference to the current thread in Java?

		 */
		Thread2 t2 = new Thread2();
		t2.start();
		//t2.join();
		System.out.println(t2.getPriority());
		System.out.println("set priority to 8 ");
		t2.setPriority(8);
		System.out.println(t2.getPriority());
		System.out.println(Thread.currentThread());
		System.out.println();
		
		/*
		Program to display all running thread
		 */
		ThreadGroup tg = Thread.currentThread().getThreadGroup();
		int n = tg.activeCount();
		System.out.println("number of current running threads " + n);
		System.out.println();
		Thread tr[] = new Thread[n];
		tg.enumerate(tr);
		for(int i=0;i<n;i++) {
			System.out.println("Thread " + i + " = " + tr[i].getName());
		}
		System.out.println();
	}

}
