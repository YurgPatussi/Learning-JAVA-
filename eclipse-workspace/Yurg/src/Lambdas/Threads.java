package Lambdas;

public class Threads {

	public static void main(String[] args) {
		
		Runnable trabalho2 = new Trabalho1();
		Runnable trabalho = new Runnable() {
		
			
			public void run() {
				for (int i =0; i<100;i++)
					System.out.println("Tarefa#02");
				try {
					Thread.sleep(100);
					
				}catch (Exception e) {}
			}
		};
		
		
		Runnable trabalho3 = () -> {
			for (int i =0; i<100;i++)
				System.out.println("Tarefa#03");
			try {
				Thread.sleep(100);
				
			}catch (Exception e) {}
		
		};
		Thread t1 = new Thread (trabalho);
		Thread t2 = new Thread (trabalho2);
		Thread t3 = new Thread (trabalho3);
		t1.start();
		t2.start();
		t3.start();
	}

}
