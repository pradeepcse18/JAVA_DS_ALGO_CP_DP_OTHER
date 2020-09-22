package thread;

public class ThreadOddEven {
	boolean odd = false;

	public static void main(String[] args) {
		ThreadOddEven obj = new ThreadOddEven();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					obj.printOddNo();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					obj.printEvenNo();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();
	}

	public void printOddNo() throws InterruptedException {
		synchronized (this) {
			for (int i = 1; i <= 10; i += 2) {
                while(!odd) {
                	 System.out.println("odd="+i);
                	 wait();
                }
                odd=false;
                notify();
			}
		}
		
	}

	public void printEvenNo() throws InterruptedException {
		synchronized (this) {
			for (int i = 0; i <= 10; i += 2) {
                 while(odd) {
                	 System.out.println("even="+i);
                	 wait();
                 }
                 odd=true;
                 notify();
			}
		}
	}
}
