package Dinning_philosopy;
public class philosoper extends Thread {
 Fork left_fork, right_fork; 
 int id;
	public philosoper(int id ,Fork left_fork, Fork right_fork) {
		this.id = id;
		this.left_fork = left_fork;
		this.right_fork = right_fork;
	}
	void think() throws InterruptedException{
		System.out.println("Philosopher "+id+" is thinking!");
		Thread.sleep(500);
	}
	void eat() throws InterruptedException{
		System.out.println("Philosopher "+id+" is requesting for leftfork!");
		left_fork.get();
		System.out.println("Philosopher "+id+" got the leftfork!");
		System.out.println("Philosopher "+id+" is requesting for rightfork!");
		right_fork.get();
		System.out.println("Philosopher "+id+" got the rightfork!");
		System.out.println("Philosopher "+id+" is eating!");
		Thread.sleep(500);
		left_fork.put();
		System.out.println("Philosopher "+id+" put the leftfork!");
		right_fork.put();
		System.out.println("Philosopher "+id+" put the rightfork!");
	}
	public void run(){
		while(true) { 
			try {
				eat();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				think();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	}

}