package multithreading;

public class MyRunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread id is " + Thread.currentThread().getId());
    }

    public static void main(String [] args) {
        for (int i=0; i<10; i++) {
            // This created only one thread with multiple objects.
            MyRunnableThread thread = new MyRunnableThread();
            thread.run();
        }

        for (int i=0; i<10; i++) {
            // This created only one thread with multiple objects.
            Thread thread = new Thread(new MyRunnableThread());
            thread.run();
            thread.start();
        }
    }
}
