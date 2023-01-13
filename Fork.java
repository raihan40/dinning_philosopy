package Dinning_philosopy;
public class Fork {
    boolean avail = true;
     synchronized void get() throws InterruptedException{
		if(avail == false) {
			System.out.println("Sorry! fork is not available.Please wait!");
			this.wait();
		}
		avail = false;
	}
	synchronized  void put() {
		this.notify();
		avail = true;
	}
	

}
