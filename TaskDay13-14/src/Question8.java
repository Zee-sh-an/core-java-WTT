class ThreadOne implements Runnable {

    @Override
    public void run() {
        System.out.println("This is thread 1");
    }
}

class ThreadTwo implements Runnable {

    @Override
    public void run() {
        System.out.println("This is Thread 2");
    }
}

class ThreadThree implements Runnable {

    @Override
    public void run() {
        System.out.println("This is thread 3");
    }
}

public class Question8 {
//    -->Question8
//    Implement a program using the Runnable interface to create and start three threads concurrently.
//    Each thread should print a unique message.

    public static void main(String[] args) {

        ThreadOne t1=new ThreadOne();
        Thread thread1=new Thread(t1);
        ThreadTwo t2=new ThreadTwo();
        Thread thread2= new Thread(t2);
        ThreadThree t3=new ThreadThree();
        Thread thread3= new Thread(t3);

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
