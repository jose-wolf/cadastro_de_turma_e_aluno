package controle;

import modelo.Estudante;
import modelo.Turma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeEstudante {

    private List<Estudante> estudantes = new ArrayList<>();

    public GerenciadorDeEstudante(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public GerenciadorDeEstudante() {
    }

    private void adicionarEstudante(Estudante estudante){
        estudantes.add(estudante);
    }

    private void listarEstudante(){
        for(Estudante estudante: estudantes){
            System.out.println("Nome: " + estudante.getNome() + "\nTelefone: " + estudante.getTelefone() + "\nEndereço: "
            + estudante.getEndereco() + "\nNome do responsável: " + estudante.getNomeResponsavel());
        }
    }

    public void criarEstudante(Scanner leitura){
        System.out.println("Digite o nome: ");
        var nome = leitura.nextLine();
        System.out.println("Digite o telefone: ");
        var telefone = leitura.nextLine();
        System.out.println("Digite o endereço ");
        var enredeco = leitura.nextLine();
        System.out.println("Digite o nome do responsável: ");
        var nomeResponsavel = leitura.nextLine();
        Estudante novoEstudante = new Estudante(nome,telefone,enredeco,nomeResponsavel);

        adicionarEstudante(novoEstudante);
    }

    public void listarEstudantes(){
        listarEstudante();
    }

    private void deletar(Estudante estudante){
        estudantes.remove(estudante);
    }

    public void deletarEstudante(Scanner leitura){
        System.out.println("Digite o nome do estudante: ");
        String nome = leitura.nextLine();

        Estudante deletarEstudante = null;
        for (Estudante procurarEstudante: estudantes){
            if(procurarEstudante.getNome().equalsIgnoreCase(nome)){
                deletarEstudante = procurarEstudante;
                break;
            }
        }

        if (deletarEstudante != null){
            estudantes.remove(deletarEstudante);
            System.out.println("Estudante com o nome " + nome + " foi deletado");
        }else{
            System.out.println("Estudante não encontrado");
        }
    }

}
