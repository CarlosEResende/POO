import java.util.Scanner;

import Celular.Iphone;

public class Usuario {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Deseja Ligar o Iphone? Sim ou Nao");
            String escolha = scanner.nextLine();

            if (escolha.equalsIgnoreCase("Sim")) {
                boolean ligado = true;

                System.out.println("Escolha uma Funcionalidade do seu Iphone!");
                System.out.println("Digite 1 para Tocar Musica");
                System.out.println("Digite 2 para Pausar a Musica");
                System.out.println("Digite 3 para Selecionar Musica");
                System.out.println("Digite 4 para Exibir Pagina");
                System.out.println("Digite 5 para Adicionar Nova Aba");
                System.out.println("Digite 6 para Atualizar Pagina");
                System.out.println("Digite 7 para Realizar Ligação");
                System.out.println("Digite 8 para Atender");
                System.out.println("Digite 9 para Iniciar Correio de Voz");
                System.out.println("Digite 0 para Desligar Iphone");

                while (ligado) {

                    System.out.print("Escolha: ");
                    int funcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (funcao) {

                        case 1:
                            iphone.tocar();
                            break;

                        case 2:
                            iphone.pausar();
                            break;

                        case 3:
                            iphone.selecionarMusica(null);
                            break;

                        case 4:
                            iphone.exibirPagina();
                            break;

                        case 5:
                            iphone.adicionarNovaAba();
                            break;

                        case 6:
                            iphone.atualizarPagina();
                            break;

                        case 7:
                            iphone.ligar(null);
                            break;

                        case 8:
                            iphone.atender();
                            break;

                        case 9:
                            iphone.iniciarCorreioVoz();
                            break;

                        case 0:
                            System.out.println("Desligando Iphone");
                            ligado = false;
                            break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }
                }
            }

            else if (escolha.equalsIgnoreCase("Nao")) {
                System.out.println("Desligando Iphone");
                scanner.close();
                break;
            } else {
                System.out.println("Opção inválida, digite 'Sim' ou 'Não'.");
            }

        }
        scanner.close();
    }

}
