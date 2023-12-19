package src;

class Counter{
    static int count;
    synchronized  public static int increment() throws InterruptedException {
        count++;
        return count;
    }
}

class Thread3 extends Thread{
    Counter counter;
    Thread3(Counter counter){
        this.counter=counter;
    }
    @Override
     public void run() {
        try {
            System.out.println(Counter.increment());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Question9 {

//    Question9
//    Create a program where multiple threads increment a shared counter.
//    Implement synchronization to avoid data corruption.

    public static void main(String[] args) throws InterruptedException {
        
        Counter counter=new Counter();
        Thread3 t1=new Thread3(counter);
        Thread3 t2=new Thread3(counter);
        Thread3 t3=new Thread3(counter);

        System.out.println(t1.getName());
        t1.start();
        t1.join();

        System.out.println(t2.getName());
        t2.start();
        t2.join();

        System.out.println(t3.getName());
        t3.start();
    }
}