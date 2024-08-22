import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criando objeto scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta! ");
        int numeroConta = sc.nextInt();

        
        System.out.print("Por favor, digite o número da Agência! ");
        String agencia = sc.next();

        System.out.print("Por favor, digite seu nome! ");
        String nome = sc.next(); 

        double saldo = 237.48;

        System.out.printf("Olá %s , obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque", nome, agencia, numeroConta, saldo);
        
    }
}