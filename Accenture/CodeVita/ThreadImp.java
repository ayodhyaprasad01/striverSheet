
public class ThreadImp implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadImp threadImp = new ThreadImp();
        Thread thread = new Thread(threadImp);
        System.out.println("Starting thread...");
        thread.start();
    }
}
