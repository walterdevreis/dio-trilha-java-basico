import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        //TODO: Criando os atributos da conta
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //TODO: Exibir as mensagens para o nosso usuário, e obter pela scanner os valores digitados no terminal
        System.out.print("Por favor, digite o número da conta do novo Cliente: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Por favor, digite o número da Agência! ");
        agencia = sc.nextLine();
        System.out.print("Por favor, digite o nome do cliente! ");
        nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o saldo inicial da conta! ");
        saldo = sc.nextDouble();

        System.out.println();

        //TODO: Exibir os dados da Conta para o usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
