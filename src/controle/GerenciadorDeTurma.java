package controle;

import modelo.Turma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeTurma {

    private List<Turma> turmas = new ArrayList<>();

    public GerenciadorDeTurma(List<Turma> turmas) {
        this.turmas = turmas;
    }


    public GerenciadorDeTurma() {
    }

    public void criarTurma(Scanner leitura){
        System.out.println("Digite o código da turma: ");
        var codigo = leitura.nextLine();
        System.out.println("Digite o nome turma: ");
        var nome = leitura.nextLine();
        System.out.println("Digite a capacidade da turma: ");
        var capacidade = Integer.parseInt(leitura.nextLine());

        Turma novaTurma = new Turma(codigo,nome,capacidade);

        adicionarTurma(novaTurma);
    }
    private void adicionarTurma(Turma turma){
        turmas.add(turma);
    }
    private void listarTurma(){
        for(Turma turma: turmas){
            System.out.println("Código: " + turma.getCodigo() + "\nNome: " + turma.getNome() + "\nCapacidade: "
            + turma.getCapacidade());
        }
    }

    public void listarTurmas(){
        listarTurma();
    }
    private void deletar(Turma turma){
        turmas.remove(turma);
    }

    public void deletarTurma(Scanner leitura){
        System.out.println("Digite o código da turma: ");
        var codigo = leitura.nextLine();

        Turma turmaDeletar = null;
        for (Turma turma : turmas){
            if (turma.getCodigo().equalsIgnoreCase(codigo)){
                turmaDeletar = turma;
                break;
            }
        }
        if(turmaDeletar != null){
            turmas.remove(turmaDeletar);
            System.out.println("Turma com o código " + codigo + " foi deletada.");
        }else{
            System.out.println("Não foi encontrado a turma com este código");
        }
    }



}
