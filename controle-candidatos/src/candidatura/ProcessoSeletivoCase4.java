package candidatura;

import java.util.Random;

public class ProcessoSeletivoCase4 {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        for(String candidato: candidatos) {
            entrnadoEmContato(candidato);
        }
    }

    static void entrnadoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean antendeu = false;

        do {
            antendeu = atender();
            continuarTentando = !antendeu;
            if (continuarTentando) {
                tentativasRealizadas++;                
            } else 
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        } while (continuarTentando && tentativasRealizadas < 3);

        if(antendeu)
        System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " CHAMADA");
        else
        System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MÁXIMO DE TENTAIVAS [" + tentativasRealizadas + "] REALIZADAS");
    }

    //método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
}
