public class Main implements Runnable{


    public void run() {
        System.out.println("Hello India");

    }


    public static void main(String args[]) {
        Main t2= new Main();
        Thread t1=new Thread(t2);
        t1.start();
        Thread t3=new Thread(t2);
        t3.start();
        Thread t4=new Thread(t2);
        t4.start();
        Thread t5=new Thread(t2);
        t5.start();
        Thread t6=new Thread(t2);
        t6.start();
    }
}
