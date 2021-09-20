
public class MultiThread {

	public static void main(String[] args) {
		SingleThread st=new SingleThread();
	Thread t=new Thread(st);
	System.out.println(Thread.currentThread());
	t.start();
	System.out.println("main ends");
	

	}

}

class SingleThread extends Thread
{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread());
		}
	}
	
}
