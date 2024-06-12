public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Status da SmartTv : Ligada ? " + smartTv.ligada);
        System.out.println("Status da SmartTv : Canal Atual : " + smartTv.canal);
        System.out.println("Status da SmartTv : Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status da SmartTv : Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status da SmartTv : Ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Status da SmartTv : Volume Atual : " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Status da SmartTv : Canal Atual : " + smartTv.canal);


    }
}
