public class TesteRunnable {
    public static void main(String[] args) throws Exception {
        // MinhaPrimeiraAtividade atividade = new MinhaPrimeiraAtividade();
        
        //Criar a bifurcação
        //Em outras palavras criou uma nova thread
        // Thread thread = new Thread(atividade);
        // thread.start();
        //Cria 50 threads simultaneas
        for(int i = 0; i < 50;i++)
            new Thread(new MinhaPrimeiraAtividade()).start();
        int cont =1;
        while(true){
            System.out.printf("%s:  %d\n", Thread.currentThread().getName(), cont++);
            //Cria uma execeção, necessita do throws exeception
            Thread.sleep(500);

        }
    }
}
