import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // cria um scanner para ler dados do teclado
        Scanner leitor = new Scanner(System.in);

        // variáveis
        double saldo = 0;
        int opcao = 0;

        // repita:
        do {
            // - mostra o saldo
            System.out.printf("Saldo: R$ %.2f\n", saldo);

            // - pede a opção
            System.out.println("1 - Depositar, 2 - Sacar, 9 - Sair: ");
            opcao = leitor.nextInt();

            // - deposita ou saca
            if(opcao == 1){
                System.out.print("Digite o valor a depositar: ");
                double valor = leitor.nextDouble();
                saldo += valor; // soma o valor no saldo

            } else if(opcao == 2){
                System.out.println("Digite o valor a sacar");
                double valor = leitor.nextDouble();
                saldo -= valor;

            } else if (opcao != 9){
                System.out.println("Opção inválida");
            }

            // até pedir pra sair
        }while(opcao != 9);

    }
}