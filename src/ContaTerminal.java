import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        //TODO: Criando os atributos da conta
        System.out.print("Por favor, isira os dados do novo Cliente: ");
        int numero = Integer.valueOf(args[0]);
        System.out.print("Por favor, digite o número da Agência! ");
        String agencia = args[1];
        System.out.print("Por favor, digite o nome do cliente! ");
        String nomeCliente = args[2];
        System.out.print("Por favor, digite o saldo inicial da conta! ");
        double saldo = Double.valueOf(args[3]);

        //Exibir as mensagens para o nosso usuário


        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
    }
}
