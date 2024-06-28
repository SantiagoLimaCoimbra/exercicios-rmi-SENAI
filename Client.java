
import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    /*
    AQUI A PEDE PRO USUÁRIO DIGITAR DOIS NUMEROS
    DEPOIS CHAMA O CALCULO DO SERVER
    RETORNA PRO USUÁRIO
     */

    public static void main(String[] args) {

        try {
            Calculator stub = (Calculator) Naming.lookup("calculatorServer");
            Scanner leitor = new Scanner(System.in);
            int opcao = 0;
            System.out.println("Escolha uma opção\n1 - calcular\n2 - Sair");
            opcao = leitor.nextInt();

            if (opcao == 1){
                System.out.println("marcia cagona");

                double retorno = stub.calc(1.0, 1.0);
                System.out.println(retorno);

                //chama calcular
            } else if (opcao == 2) {
                System.out.println("sant");
                leitor.close();
            } else {
                System.out.println("Digite um valor valido");
            }

//            while (opcao != 9) {
//                System.out.println("Escolha uma opção\n1 - calcular\n9 - Sair");
//                opcao = leitor.nextInt();
//                if (opcao == 1) {
//                    System.out.println(stub.digaOla());
//                }
//            }
            System.out.println("Finalizando a aplicação cliente");
            leitor.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        try {
//            Hello stub = (Hello) Naming.lookup("OlaServer");
//            Scanner leitor = new Scanner(System.in);
//            int opcao = -1;
//            while (opcao != 9) {
//                System.out.println("Escolha uma opção\n1 - Diga Olá\n9 - Sair");
//                opcao = leitor.nextInt();
//                if (opcao == 1) {
//                    System.out.println(stub.digaOla());
//                }
//            }
//            System.out.println("Finalizando a aplicação cliente");
//            leitor.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

}
