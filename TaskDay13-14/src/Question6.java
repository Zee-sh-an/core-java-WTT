
class Thread1 extends Thread{

     public void run(){

        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}

public class Question6 {
//    -->Question6
//    Write a Java program that creates two threads, each printing numbers from 1 to 10.
//    Ensure proper synchronization to avoid interleaving


    public static void main(String[] args) throws InterruptedException {

        Thread1 t1=new Thread1();
        Thread1 t2=new Thread1();
        t1.start();
//      Join method in Java allows one thread to wait until another thread completes its execution
//        t1.join();
        System.out.println();
        t2.start();
    }

}
