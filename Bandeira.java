public class Bandeira implements Runnable {
    private Thread threadPrincipal;
    private Thread threadPrincipal1;
    private Thread threadPrincipal2;
    private Thread threadPrincipal3;
    private Thread threadPrincipal4;
    public Bandeira(Thread threadPrincipal, Thread threadPrincipal1,Thread threadPrincipal2,Thread threadPrincipal3,Thread threadPrincipal4){
        this.threadPrincipal = threadPrincipal;
        this.threadPrincipal1 = threadPrincipal1;
        this.threadPrincipal2 = threadPrincipal2;
        this.threadPrincipal3 = threadPrincipal3;
        this.threadPrincipal4 = threadPrincipal4;
    }

    // public Bandeira(Thread ... th){
    //         for(int i = 0; i < th.length;i++)
    //             this.threadPrincipal =th[i];
    // }
    public void run(){
        try{
            threadPrincipal.join();
            threadPrincipal1.join();
            threadPrincipal2.join();
            threadPrincipal3.join();
            threadPrincipal4.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Acabou");
    }
}
