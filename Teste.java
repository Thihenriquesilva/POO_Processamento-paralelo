public class Teste {
    public static void main(String[] args) {
        MinhaPrimeiraThread thread = new MinhaPrimeiraThread();

        // thread.run();
        //Inicializa o processamento paralelo
        thread.start();
        System.out.printf("Método main: %s\n", Thread.currentThread().getName());
        System.out.println("Método main ainda está executando");
    
    }
}
