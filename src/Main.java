import controle.GerenciadorDeEstudante;
import controle.GerenciadorDeTurma;
import controle.Menu;
import modelo.Turma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciadorDeTurma gerenciadorDeTurma = new GerenciadorDeTurma();
        GerenciadorDeEstudante gerenciadorDeEstudante = new GerenciadorDeEstudante();
        var opcao = 1;
        while (opcao != 7){
            switch (opcao){
                case 1:
                    gerenciadorDeTurma.criarTurma(sc);
                    break;
                case 2:
                    gerenciadorDeEstudante.criarEstudante(sc);
                    break;
                case 3:
                    gerenciadorDeTurma.listarTurmas();
                    break;
                case 4:
                    gerenciadorDeEstudante.listarEstudantes();
                    break;
                case 5:
                    gerenciadorDeTurma.deletarTurma(sc);
                    break;
                case 6:
                    gerenciadorDeEstudante.deletarEstudante(sc);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Valor inválido");
            }
            Menu.menu();
            opcao = Integer.parseInt(sc.nextLine());

        }
    }
}