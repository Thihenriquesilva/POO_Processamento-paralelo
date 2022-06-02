public class MinhaPrimeiraAtividade implements Runnable {
    public void run(){
        System.out.printf("Executando na thread: %s\n", Thread.currentThread().getName());
        int cont =1;
        while(true){
            try{
                System.out.printf("%s:  %d\n", Thread.currentThread().getName(), cont++);
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
