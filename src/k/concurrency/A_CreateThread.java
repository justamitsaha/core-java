package k.concurrency;

//Thread can be created by extending Thread class or implementing runnable interface. When thread.start() is called then the overridden run method is run in a separate thread
public class A_CreateThread extends Thread{
	public static void main(String[] args) {
		A_CreateThread thread = new A_CreateThread();  // Extending thread 
		thread.start();
		
		new Thread() {																//Inner class
			public void run(){ 
				System.out.println("This is a thread created from Inner class ");
				System.out.println(Thread.activeCount());
			}
		}.start();
		
		Runnable task = (() -> { System.out.println("This is a thread created from functional interface using Lambda");});
		new Thread(task).start();
		task.run();  //This will not create a new thread will execute as part of main
		
		ThreadWithRunnable thread2 = new ThreadWithRunnable(); //From runnable
		thread2.run();
		
		
	}

	@Override
	public void run() {
		super.run();
		System.out.println("This is a thread created from extending Thread class ");
	}
}

class ThreadWithRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("This is a thread created from implementing Runnable ");
	}
}
//A thread is the smallest unit of execution that can be scheduled by the operating system. A process is a group of associated threads that execute in the same, shared environment(memory space)
//A task is a single unit of work performed by a thread.A thread can complete multiple independent tasks but only one task at a time.
//A system thread is created by the JVM and runs in the background of the application.  Garbage collection for example
//a user‐defined thread is one created by the application developer to accomplish a specific task e.g. main or any other thread
//a daemon thread is one that will not prevent the JVM from exiting when the program finishes. For example, if garbage collection is the only thread left running, the JVM will automatically shut down.
//The property of executing multiple threads and processes at the same time is referred to as concurrency. OS uses thread scheduler to determine which threads should be currently executing,For example, a thread scheduler may employ a round‐robin schedule in which each available thread receives an equal number of CPU cycles with which to execute.
//A context switch is the process of storing a thread's current state and later restoring the state of the thread to continue execution. Be aware that there is often a cost associated with a context switch by way of lost time saving and reloading a thread's state. Intelligent thread schedules do their best to minimize the number of context switches, while keeping an application running smoothly.
//a thread can interrupt or supersede another thread if it has a higher thread priority than the other thread. A thread priority is a numeric value associated with a thread that is taken into consideration by the thread scheduler when determining which threads should currently be executing. In Java, thread priorities are specified as integer values.