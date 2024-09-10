package org.example;

public class Estagiario extends Funcionario{

    private String instituicaoEnsino;
    private String BolsaEnsino;
    public Estagiario(String nome, String cpf, String instituicaoEnsino, double salario) {
        super(nome, cpf, salario);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicao(String instituicao) {
        this.instituicaoEnsino = instituicao;
    }

    public String getBolsaEnsino() {
        return BolsaEnsino;
    }

    public void setBolsaEnsino(String bolsaEnsino) {
        BolsaEnsino = bolsaEnsino;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: "+ getNome()
                +" ,CPF: "+ getCpf()
                +" ,Salario: "+ getSalario()
                +" ,Instituicao: "+ getInstituicaoEnsino()
                +" ,Valor Bolsa: "+ getBolsaEnsino());
    }
}
