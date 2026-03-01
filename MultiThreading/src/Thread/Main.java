package Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread= new MyThread();
////        myThread.run();
//        myThread.start();
////        System.out.println(myThread.getId());
//        System.out.println(myThread.threadId());
//        myThread.join();

//        MyThreadInterface myThreadInterface= new MyThreadInterface();
//        Thread t1= new Thread(myThreadInterface);
//        t1.start();

        SleepDemo sleepDemo= new SleepDemo();
        sleepDemo.start();
        System.out.println("main");

    }
}
