package org.example;

public class FuncionarioTempoIntegral extends Funcionario{

    private double bonus;

    public FuncionarioTempoIntegral(String nome, String cpf, double salario, double bonus) {
        super(nome, cpf, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    public void exibirInformacoes() {
        System.out.println("Nome: "+ getNome()
                           +" ,CPF: "+ getCpf()
                           +" ,Salario: "+ getSalario());
    }
}
