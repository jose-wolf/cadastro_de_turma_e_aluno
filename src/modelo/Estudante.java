package modelo;

public class Estudante {

    private String nome;

    private String telefone;
    private String endereco;
    private String nomeResponsavel;

    public Estudante(String nome, String telefone, String endereco, String nomeResponsavel) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.nomeResponsavel = nomeResponsavel;
    }


    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }
}
