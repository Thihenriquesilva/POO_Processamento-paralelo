public class MinhaPrimeiraThread extends Thread{
    
    //Permite criar execuções, para serem executadas em paralelo com o método main
    
    public void run(){
        System.out.printf("Método run: %s\n", Thread.currentThread().getName());
        System.out.println("Estou sendo executado por uma thread diferente da principal");
    }
}
