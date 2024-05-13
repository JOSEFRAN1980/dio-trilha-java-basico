import java.util.Scanner;

public class contaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BEM VINDO AO NOSSO BANCO!");

        System.out.println("Por favor, insira o númro da agência:");
        int numeroDaAgencia = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, insira o númro da conta:");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, insira o nome do correntista:");
        String nomeDoCorrentista = scanner.nextLine();

        System.out.println("Por favor, insira o saldo:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nOlá " + nomeDoCorrentista + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + numeroDaAgencia + ", conta: " + numeroDaConta + ", saldo: " + saldo + ", já está disponível para sempre.");

        scanner.close();
    }
    

}
