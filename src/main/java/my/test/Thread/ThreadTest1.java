package my.test.Thread;

public class ThreadTest1 extends Thread{
    @Override
    public void run() {
        System.out.println("继承Thread类,");
    }

    public static void main(String[] args) {
        new ThreadTest1().start();
    }
}
