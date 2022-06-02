public class Corredor implements Runnable {
    //Variavel compartilhada com todos os corredores
    private static double distanciaTotalDaCorrida = 500;
    private double distanciaTotalPercorrida = 0;
    private Thread threadPrincipal;

    public Corredor(Thread threadPrincipal){
        this.threadPrincipal = threadPrincipal;
    }
    public void run(){
        try{
            //Amarra a thread a thread principal
            threadPrincipal.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        //Enquanto o corredor não tiver terminado
        while(distanciaTotalPercorrida < distanciaTotalDaCorrida){
             //Correr um valor aleatório entre 0 a 50
             distanciaTotalPercorrida+= Math.random() * 50;
             //exibir a informação de que o corredor atual ja correu tantos metros
             System.out.printf("%s correu %.2f metros\n", Thread.currentThread().getName(), distanciaTotalPercorrida);
            //dormir uma quantidade aleatória de milissegundos(2 a 5)
             try{
                Thread.sleep(2000 + (int)Math.random() * 3000);

            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.printf("%s ganhou!!\n", Thread.currentThread().getName());
    }
    
}
