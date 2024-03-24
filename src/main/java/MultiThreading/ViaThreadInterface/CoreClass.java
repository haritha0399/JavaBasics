package MultiThreading.ViaThreadInterface;

public class CoreClass {
    public static void main(String args[]){

        System.out.println("Main thread started");

        Thread thread1 =  new Thread1Class("First user thread");
        //To create daemon thread
        /* daemon thread is a BG thread which helps the user thread until the user thread is alive
        when all the user threads are dead even if the daemon threads are alive then the progra won't continue
        the execution
         */
//        thread1.setDaemon(true);

        thread1.start();

        System.out.println("Main thread exited!");

    }
}
