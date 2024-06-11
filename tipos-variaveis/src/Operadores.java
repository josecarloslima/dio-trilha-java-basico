public class Operadores {
    public static void main(String[] args) {
        /* 
        //Concatenização
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);

        //Concatenação e soma
        String concatenacao = "?";
        System.out.println(concatenacao);

	    concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

	    concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

	    concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

	    concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

	    concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        Operadores Unários
        int numero = 5;
        System.out.println(numero);
        System.out.println(- numero);
        numero = - numero;
        System.out.println(numero);
        numero = + numero;
        numero = numero * -1;
        System.out.println(numero);
        System.out.println(numero++);
        System.out.println(numero);
        System.out.println(++numero);

        int a, b;
        a = 5;
        b = 6;
        String resultado = a==b ? "verdadeiro" : "falso";

        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("os numeros são iguais?" + simNao);

        simNao = numero1 != numero2;
        System.out.println("os numeros são diferentes?" + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 é maior do que dumero2?" + simNao);

        simNao = numero1 < numero2;
        System.out.println("numero1 é menor do que dumero2?" + simNao);

        if(numero1 == numero2){
            System.out.println("condição verdadiera");
        } else {
            System.out.println("condição falsa");
        }
        
        String nome1 = "Gleysson";
        String nome2 = new String("Gleysson");

        System.out.println(nome1.equals(nome2));
        */

        boolean condição1 = true;
        boolean condição2 = false;

        if(condição1 && condição2){
            System.out.println("verdadeiras");
        }

        if(condição1 || condição2){
            System.out.println("uma das condições é verdadeira");
        }

        System.out.println("fim");
    }
}