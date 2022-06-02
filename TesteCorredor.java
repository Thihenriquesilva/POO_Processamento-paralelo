public class TesteCorredor {
    public static void main(String[] args) throws Exception{
        //Pega o nome da thread corrente(Atual, neste caso essa mesma)
        Thread t = Thread.currentThread();
        //Modo preguiça
        // for(int i = 0; i < 5;i++)
        //     new Thread(new Corredor(t), String.format("piloto %d", i)).start();
        
        Thread thread = new Thread(new Corredor(t), "Tico");
        Thread thread1 = new Thread(new Corredor(t), "Teco");
        Thread thread2 = new Thread(new Corredor(t), "Mickey");
        Thread thread3 = new Thread(new Corredor(t), "Patolino");
        Thread thread4 = new Thread(new Corredor(t), "Frajola");
        Thread bandeira = new Thread(new Bandeira(thread, thread1, thread2, thread3, thread4));
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        bandeira.start();

        //Resolver o problema acabou
        System.out.println("Começou");
        // System.out.println("Acabou");
        
        
        
        
        
    }
}
