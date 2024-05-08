import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String nomeCliente;
        String agencia;
        int numero;
        float saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome!");
        nomeCliente = scanner.nextLine();

        System.out.println("Agora, " + nomeCliente + ", digite o código da agência!");
        agencia = scanner.nextLine();
        
        System.out.println("E então, digite o número da conta!");
        numero = scanner.nextInt();
        
        System.out.println("Por último, informe o saldo!");
        saldo = scanner.nextFloat();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco!" + 
                "\nSua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque!");





    }
}
