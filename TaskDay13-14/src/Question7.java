class Thread2 extends Thread{

    public void run(){
        for (int i=1;i<=10;i++){
            try {
                Thread2.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}

public class Question7 {

//    -->Question7
//Extend the previous program to make one thread sleep for 200 milliseconds after printing each number.
// Observe the execution order.

    public static void main(String[] args) {

        Thread2 t1=new Thread2();
        Thread1 t2=new Thread1();//this is from Question6
        t1.run();
        t2.run();
    }

}
