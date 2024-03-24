package MultiThreading.ViaThreadInterface;

public class Thread1Class extends Thread{

    public Thread1Class(String firstUserThread) {
        super(firstUserThread);
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Inside "+Thread.currentThread()+" "+i);
        }
    }
}
