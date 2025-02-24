import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite agencia da conta:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

        scanner.close();
    }
}