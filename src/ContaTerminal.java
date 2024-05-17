import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        int conta = scanner.nextInt();  
        scanner.nextLine();  

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();  
      

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ conta +" e seu saldo "+ saldo +" já está disponível para saque!");
    }
}
