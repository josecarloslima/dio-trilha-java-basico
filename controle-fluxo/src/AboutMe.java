import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();
            
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Altura: " + altura + " metros");
        } 
        catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }

        /* 
        Vamos começar a prever as interações indevidas do usuário, o que no caso desta aplicação pode ser:
        - não informar nome ou sobrenome
        - informar idade não numérica
        - usar vírgula na altura em vez de ponto
        */       
        
    }
}
