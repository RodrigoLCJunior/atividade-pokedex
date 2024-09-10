package org.example;

public class FuncionarioMeioPeriodo extends Funcionario{

    private int horasTrab;
    private double valorHora;
    public FuncionarioMeioPeriodo(String nome, String cpf, double salario, int horasTrab) {
        super(nome, cpf, salario);
        this.horasTrab = horasTrab;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: "+ getNome()
                +" ,CPF: "+ getCpf()
                +" ,Salario: "+ getSalario()
                +" ,Horas Trabalhadas: "+ getHorasTrab()
                +" ,Valor por hora: "+ getValorHora());
    }
}
