package MultiThreading.ViaRunnableInterface;

public class CoreClass {

    public static void main(String args[]){
        System.out.println("Main thread is starting");

//        Thread thread2 = new Thread(new Thread2Class(),"secondThread");
//        thread2.start();

        Thread thread2 = new Thread(() ->{
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread()+" "+i);
            }
        }, "thread 2");
        thread2.start();
        System.out.println("Main thread is exiting");

        new Thread().run();
    }
}
