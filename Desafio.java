import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Desafio {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        double saldo = 2500;
        double depositar, valor;
        boolean sair = false;

        System.out.println("""
                Minha primeira aplicação JAVA
                *************************************
                Nome:                   Uryel Farias
                Tipo Conta:           Conta corrente
                Saldo Inicial:           R$ 2.500,00
                *************************************
                """);

        while (!sair) {
            System.out.println("""
                    
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                                    
                    """);

            System.out.println("Digite a opção desejada: ");
            int opcao = entrada.nextInt();

            while(opcao > 4 || opcao < 1 ) {
                System.out.println("Opção inválida! Por favor digite novamente: ");
                opcao = entrada.nextInt();
            }

            switch (opcao) {
                case 1:
                    System.out.println("Saldo = " + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor do deposito: ");
                    depositar = entrada.nextDouble();
                    saldo += depositar;
                    System.out.println("Saldo atual = " + saldo);
                    break;

                case 3:
                    System.out.println("Digite o valor da transferência: ");
                    valor = entrada.nextDouble();
                    while( valor > saldo ) {
                        System.out.println("Saldo insuficiente, digite um valor menor.");
                        valor = entrada.nextDouble();
                    }
                    saldo -= valor;
                    System.out.println("Saldo atual = " + saldo);
                    break;

                case 4:
                    System.out.println("""
                            
                            Encerrando o programa
                            ...
                            ...
                            ...
                            OFFLINE
                            
                            """);
                    sair = true;
                    break;
            }
        }
    }
}