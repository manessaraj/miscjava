package multithreading;

public class MyThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("Thread id is: " + Thread.currentThread().getId());
    }

    public static void main(String [] args) {
        for (int i=0; i<10; i++) {
            MyThreadClass thread = new MyThreadClass();
            thread.run();
            // So thread and run are equivalent
            thread.start();
        }
    }
}
