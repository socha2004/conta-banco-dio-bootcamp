import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entradaDeDados = new Scanner(System.in);

        int numeroConta;
        String agenciaConta;
        String nomeCliente;
        double saldoConta;

        System.out.println("Olá! Por favor insira o número da conta: ");
        numeroConta = entradaDeDados.nextInt();

        System.out.println("Insira a agência da conta: ");
        agenciaConta = entradaDeDados.next();

        System.out.println("Insira o nome do cliente: ");
        nomeCliente = entradaDeDados.next();

        System.out.println("Insira o saldo da conta: ");
        saldoConta = entradaDeDados.nextDouble();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta 
        + " , conta " + numeroConta
        + " e seu saldo " + saldoConta 
        + " já está disponível para saque." 
        );
    }
}
